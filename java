// Smooth Scrolling für Navigation
document.querySelectorAll('nav ul li a').forEach(link => {
    link.addEventListener('click', function (e) {
        e.preventDefault();
        const target = document.querySelector(this.getAttribute('href'));
        target.scrollIntoView({ behavior: 'smooth' });
    });
});

// Scroll-Effekte für den Header
const header = document.querySelector('header');
window.addEventListener('scroll', () => {
    if (window.scrollY > 50) {
        header.classList.add('scrolled');
    } else {
        header.classList.remove('scrolled');
    }
});

// Formular-Feedback nach dem Absenden
const form = document.querySelector('form');
form.addEventListener('submit', function (e) {
    e.preventDefault(); // Verhindert das automatische Neuladen der Seite
    alert('Vielen Dank für deine Nachricht! Wir werden uns bald bei dir melden.');
    form.reset(); // Setzt das Formular zurück
});

// Themen-Bereich: Button-Animation
const topicButtons = document.querySelectorAll('.topic .button');
topicButtons.forEach(button => {
    button.addEventListener('mouseover', () => {
        button.style.backgroundColor = '#1C2F41'; // Button-Farbe ändern
    });
    button.addEventListener('mouseout', () => {
        button.style.backgroundColor = '#2E4A62'; // Ursprüngliche Farbe wiederherstellen
    });
});

// Dynamische Jahreszahl im Footer
const yearSpan = document.createElement('span');
yearSpan.textContent = new Date().getFullYear();
document.querySelector('footer p').appendChild(yearSpan);