function animate_string(id) 
{
    var element = document.getElementById(id);

    var textNode = element.childNodes[0];
    
    var text = textNode.data;

    setInterval(function () 
    {
        text = text[text.length - 1] + text.substring(0, text.length - 1);

        textNode.data = text;
    }, 100);
} 


function animate_vertical_string(id) {
    var element = document.getElementById(id);
    var currentTop = 0; // Keeps track of the current top position
    var elementHeight = element.offsetHeight; // Gets the height of the element

    setInterval(function () {
        currentTop -= 20; // Move text upwards by 20px each time
        if (Math.abs(currentTop) >= elementHeight) {
            currentTop = 0; // Reset when the text has fully scrolled through
        }
        element.style.top = currentTop + "px"; // Set the new top position
    }, 100);
}

animate_vertical_string('vertical-text');
