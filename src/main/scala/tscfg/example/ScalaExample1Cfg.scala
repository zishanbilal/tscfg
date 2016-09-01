// generated by tscfg 0.3.3 on Thu Sep 01 11:12:22 PDT 2016
// source: example/example1.spec.conf

package tscfg.example

object ScalaExample1Cfg {
  def apply(c: com.typesafe.config.Config) = build(Some(c))
  def apply() = build(None)
  def build(c: scala.Option[com.typesafe.config.Config]): ScalaExample1Cfg = {
    ScalaExample1Cfg(
      c.map(c => if(c.hasPathOrNull("bazOptionalWithDefault")) c.getString("bazOptionalWithDefault") else "hello").get,
      c.map(c => if(c.hasPathOrNull("bazOptionalWithNoDefault")) Some(c.getString("bazOptionalWithNoDefault")) else None).get,
      c.get.getString("fooRequired")
    )
  }
}
case class ScalaExample1Cfg(
  bazOptionalWithDefault   : java.lang.String,
  bazOptionalWithNoDefault : scala.Option[java.lang.String],
  fooRequired              : java.lang.String
) {
  override def toString: java.lang.String = toString("")
  def toString(i:java.lang.String): java.lang.String = {
    i+ "bazOptionalWithDefault   = " + this.bazOptionalWithDefault + "\n"+
    i+ "bazOptionalWithNoDefault = " + this.bazOptionalWithNoDefault + "\n"+
    i+ "fooRequired              = " + this.fooRequired + "\n"
  }
}