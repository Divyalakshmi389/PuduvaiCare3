<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
 <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
        integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
   <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/webresources/styles/puduvai1.css" />


<title>Puduvai Care</title>
</head>
<body>

<section id="top">
        <div class="container">
            <div class="logo"><img src="${pageContext.request.contextPath}/webresources/images/pylogo.png" alt="Pondicherry Logo"></div>
            <div class="heading">

                <center>
                    <h2>PUDUCHERRY COVID-19 TRACKER</h2>
                </center>

            </div>
        </div>
        </div>
    </section>
    
<%-- to iterate the result values using jstl loop--%>

<c:forEach var="res" items="${result}">

    <section id="bottom">
        <div class="row">
            <div class="col-lg-6 col-md-6 col-xs-12">
                <div class="card A">
                    <div class="card-header HC HC1">
                        TOTAL CASES
                    </div>
                    <div class="card-body BC BC1">
                        <p class="card-text">   <c:out value="${res.total}"/></p>
                    </div>
                </div>
            </div>

            <div class="col-lg-6 col-md-6 col-xs-12">
                <div class="card B">
                    <div class="card-header HC HC2">
                        ACTIVE CASES
                    </div>
                    <div class="card-body BC BC2">
                        <p class="card-text">  <c:out value="${res.active}"/></p>
                    </div>
                </div>
            </div>


            <div class="col-lg-6 col-md-6 col-xs-12">
                <div class="card C">
                    <div class="card-header HC HC3">
                        CURED CASES
                    </div>
                    <div class="card-body BC BC3">
                        <p class="card-text"><c:out value="${res.cured}"/> </p>
                    </div>
                </div>
            </div>
            <div class="col-lg-6 col-md-6 col-xs-12">
                <div class="card D">
                    <div class="card-header HC HC4">
                        DEATH CASES
                    </div>
                    <div class="card-body BC BC4">
                        <p class="card-text"><c:out value="${res.death}"/> </p>
                    </div>
                </div>
            </div>
        </div>

 </c:forEach>

        <marquee behavior="alternate" scrollamount="12">
            <h5>CLICK BELOW LINK AND GET VACCINATED BY BOOKING YOUR SLOTS...!</h5>
        </marquee>

        <div class=link>
            <a href=" https://www.cowin.gov.in/" target="_blank">
                <h5>
                    <center>Click Here For Vaccine Registration</center>
                </h5>
            </a>
        </div>

    </section> 
            
 </section>
    <section id="footer">
        <div class="foot">
            <h3><i>Helpful Links</i></h3>
            <br>
            <p><a href="https://www.who.int/emergencies/diseases/novel-coronavirus-2019" target="_blank">WHO: COVID-19
                    Home Page></a></p>
            <p><a href=" https://www.mohfw.gov.in/" target="_blank">Ministry of Health and Family Welfare, Gov. of
                    India</a></p>
            <p><a href="https://www.cdc.gov/coronavirus/2019-ncov/faq.html" target="_blank">Centers for Disease Control
                    and
                    Prevention (CDC)</a></p>
            <p><a href="https://coronavirus.thebaselab.com/" target="_blank">COVID-19 Global Tracker</a></p>
            <p><i>An effort by Divya to keep our loved ones safe ...!</i></p>

        </div>
    </section>
       
      
</body>
</html>