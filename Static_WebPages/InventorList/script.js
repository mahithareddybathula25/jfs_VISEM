const inventorData = {
    james: {
        img: "images/james.jpg",
        info: "James Gosling is the creator of Java. He developed Java at Sun Microsystems in 1995, laying the foundation for platform-independent programming."
    },
    guido: {
        img: "images/guido.jpg",
        info: "Guido van Rossum invented Python in 1991 with a philosophy of code readability, simplicity, and developer productivity."
    },
    dennis: {
        img: "images/dennis.jpg",
        info: "Dennis Ritchie invented the C programming language and co-created Unix, massively influencing the world of operating systems and programming."
    },
    bjarne: {
        img: "images/bjarne.jpg",
        info: "Bjarne Stroustrup created C++ as an extension of C, adding object-oriented features while maintaining high performance."
    },
    brendan: {
        img: "images/brendan.jpg",
        info: "Brendan Eich invented JavaScript in 1995 while working at Netscape, enabling dynamic and interactive web pages."
    },
    rasmus: {
        img: "images/rasmus.jpg",
        info: "Rasmus Lerdorf created PHP originally as a tool to manage his personal website. It later evolved into a major web programming language."
    },
    yukihiro: {
        img: "images/yukihiro.jpg",
        info: "Yukihiro Matsumoto (Matz) developed Ruby with focus on programmer happiness and elegant coding practices."
    },
    anders: {
        img: "images/anders.jpg",
        info: "Anders Hejlsberg is the creator of C# and has also contributed to TypeScript and Turbo Pascal."
    },
    grace: {
        img: "images/grace.jpg",
        info: "Grace Hopper was a pioneer of computer programming and created COBOL. She also developed the first compiler for a programming language."
    },
    john: {
        img: "images/john.jpg",
        info: "John McCarthy created Lisp, one of the oldest programming languages and a foundation for artificial intelligence research."
    }
};

document.getElementById("inventorSelect").addEventListener("change", function () {
    const key = this.value;
    const img = document.getElementById("inventorImg");
    const details = document.getElementById("details");

    if (key === "") {
        img.src = "";
        details.innerHTML = "";
        img.classList.remove("square");
    } else {
        img.src = inventorData[key].img;
        details.innerHTML = inventorData[key].info;

        if (key === "james") {
            img.classList.add("square");
        } else {
            img.classList.remove("square");
        }
    }
});

