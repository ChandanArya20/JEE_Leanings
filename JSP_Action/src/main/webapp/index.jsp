<%@ page language="java"%>

<jsp:useBean id="calculator" class="in.ineuron.bean.Calculator"/>
<h1>
	The Square of 5 is :: <%= calculator.squareIt(5)%><br/>
	The Square of 6 is :: <%= calculator.squareIt(6)%><br/>
</h1>


<h1 style="text-align:center;">Setting values to the Student object</h1>

<jsp:useBean id="student" class="in.ineuron.bean.Student"/>

<jsp:setProperty name="student" property="sid" value="23"/>
<jsp:setProperty name="student" property="sname" value="Chandan"/>
<jsp:setProperty name="student" property="saddress" value="Bahuarwa"/>
<jsp:setProperty name="student" property="sage" value="20"/>

//-------------------------------------------------------------------

<jsp:setProperty name="student" property="sid"  param="sid"/>
<jsp:setProperty name="student" property="sname"  param="sname"/>
<jsp:setProperty name="student" property="saddress"  param="saddress"/>
<jsp:setProperty name="student" property="sage" param="sage"/>

<jsp:setProperty name="student" property="*"/>
		<%=student%>

//-----------------------------------------------------------------------


<h1 style="text-align:center;">Setting values to the Student object</h1>
<jsp:getProperty name="student" property="sid"  />
<jsp:getProperty name="student" property="sname"  />
<jsp:getProperty name="student" property="saddress" />
<jsp:getProperty name="student" property="sage" />
	
	  <%=student%>

