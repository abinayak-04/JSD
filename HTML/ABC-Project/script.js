function randomColour() {
  const colours = ["green", "blue", "red"];
  const randomIndex = Math.floor(Math.random() * colours.length);
  return colours[randomIndex];
}

const headings = document.querySelectorAll("h5");

headings.forEach(function (heading) {
  heading.addEventListener("click", function () {
    heading.style.color = randomColour();
  });
});
