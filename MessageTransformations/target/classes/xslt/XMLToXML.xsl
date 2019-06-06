<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:template match="/">
		<Students>
			<xsl:for-each select="/Studs/Stud"> 
				<Student>
					<Name><xsl:value-of select="name"/></Name>
					<ID><xsl:value-of select="Rollno"/></ID>
				</Student>
			</xsl:for-each>
		</Students>
	</xsl:template>
</xsl:stylesheet>