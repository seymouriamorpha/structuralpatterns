<b>
    <h1 align="center"> Structural patterns </h1>
</b>

***

<details>
    <summary> Pattern "Adaptor" </summary>
    <p> A software developer, Max, has worked on an e-commerce website. 
    <p> The website allows users to shop and pay online. The site is integrated with a 3rd party payment gateway, through which users can pay their bills using their credit card.
    <p> Everything was going well, until his manager called him for a change in the project. The manager told him that they are planning to change the payment gateway vendor, and he has to implement that in the code. 
    <p> The problem that arises here is that the site is attached to the XPay payment gateway which takes an XPay type of object. The new vendor, YPay, only allows the YPay type of objects to allow the process. 
    <p> Max doesn’t want to change the whole set of 100 of classes which have reference to an object of type XPay. This also raises the risk on the project, which is already running on the production. Neither he can change the 3rd party tool of the payment gateway. The problem has occurred due to the incompatible interfaces between the two different parts of the code.
    <p> In order to get the process work, Max needs to find a way to make the code compatible with the vendor’s provided API.
</details>

***

<details>
    <summary> Pattern "Decorator" </summary>
    <p> "Starbuzz" cafe have problems with software. 
    <p> Their young programmer Max (son of the director's mistress) wrote a code with a huge number of classes.
    <p> Each class was a specific drink with a certain amount of fillers:
    <pre>
        <p> EspressoMocha.java
        <p> EspressoSoy.java
        <p> EspressoSoySoyWhip.java
        <p> DecafMochaMochaSoyWhip.java
        <p> DarkRoastMochaMochaSoyWhipWhip.java , etc
    </pre>
    <p> Last week Max bought on Amazon a book about patterns and found inside information about "Decorator" pattern.  
    <p> Please, help Max implement this pattern in practice.
</details>

***