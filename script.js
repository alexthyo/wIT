window.addEventListener('DOMContentLoaded', function() {
    var berechnenButton = document.getElementById('berechnenButton');
    berechnenButton.addEventListener('click', function() {
        var gewinnInput = document.getElementById('gewinnInput');
        var dividendeOutput = document.getElementById('dividendeOutput');
        var ruecklagenOutput = document.getElementById('ruecklagenOutput');
        var gewinnvortragOutput = document.getElementById('gewinnvortragOutput');

        var gewinn = parseFloat(gewinnInput.value);
        if (!isNaN(gewinn)) {
            var dividende = gewinn * 0.5;
            var ruecklagen = gewinn * 0.3;
            var gewinnvortrag = gewinn * 0.2;

            dividendeOutput.textContent = dividende.toFixed(2);
            ruecklagenOutput.textContent = ruecklagen.toFixed(2);
            gewinnvortragOutput.textContent = gewinnvortrag.toFixed(2);
        }
    });
});
