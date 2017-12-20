# Visual Captcha WS

This component is based on Visual Captcha(http://visualcaptcha.net/) and aims to isolate backend and frontend behaviors using JQuery and HTML5 resources to client side and JAX-RS to server side.

Some changes must be done, like:

1) Convert project to a Maven project
2) Give a better treatment to client routes
3) Add visual feedback to valid/invalid choices

It was developed using Java version 7 and JQuery 2.2.4.

Above are Java libraries necessary to use this component. (all of then are at WEB-INF/libs folder)

* asm-3.1.jar
* gson-2.1-javadoc.jar
* gson-2.1-sources.jar
* gson-2.1.jar
* jersey-core-1.11.jar
* jersey-json-1.11.jar
* jersey-server-1.11.jar
* jersey-servlet-1.11.jar
* jsr311-api-1.1.1.jar


#Workflow

* Client requests a new captcha
* Server creates a list containing five image options and one audio option.
* One of them is marked as the corret option.
* The response is sent back as JSON.
* JQuery component invokes Visual Captcha client and storage data into a temporary localStorage.
* User selects an option.
* JQuery component validates it.

