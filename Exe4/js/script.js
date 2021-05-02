if (!localStorage.theme) localStorage.theme = "light"
document.body.className = localStorage.theme
onButton.innerText = document.body.classList.contains("dark") ? "Тема Lights" : "Тема Dark"

onButton.onclick = () => {
	document.body.classList.toggle("dark")
	onButton.innerText = document.body.classList.contains("dark") ? "Тема Lights" : "Тема Dark"
	localStorage.theme = document.body.className || "light"
}
