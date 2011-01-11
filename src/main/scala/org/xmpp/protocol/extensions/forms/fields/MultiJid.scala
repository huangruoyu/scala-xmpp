package org.xmpp
{
	package protocol.extensions.forms.fields
	{
		import scala.collection._
		import scala.xml._
		
		import org.xmpp.protocol._
		
		import org.xmpp.protocol.Protocol._
		
		object MultiJid
		{		
			val fieldType = FieldTypeEnumeration.MultiJid
			val fieldTypeName = fieldType.toString
			
			def apply(identifier:Option[String]=None, label:Option[String]=None, description:Option[String]=None, required:Boolean=false, children:Option[Seq[Node]]=None):MultiJid =
			{
				val xml = Field.build(MultiJid.fieldType, identifier, label, description, required, children)
				return apply(xml)
			}
			
			def apply(xml:Node):MultiJid = new MultiJid(xml)
		}
		
		class MultiJid(xml:Node) extends Field(xml, MultiJid.fieldType)
		{
		}
		
	}
}
