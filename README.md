# DaimlerCodeTest
Rahmenbedingungen

  Bitte die Aufgabe selbstständig und alleine lösen,
  natürlich darf dabei Literatur und / oder das Internet benutzt werden.
  Bitte teilen Sie uns Ihre Bearbeitungszeit mit.
  Die Lösung hätten wir gerne als GitHub Repository.
  Die Programmiersprache ist frei wählbar, wobei eine ‘gewöhnliche’ Sprache bevorzugt wäre.
  Das Resultat muss von uns gebaut und ausgeführt werden können. Bitte entsprechende build-scripte
  oder Makefiles bereitstellen.
  Eigene Annahmen und wichtige Implementierungsdetails bitte klar kommentieren.
  Eventuelle sinnvolle Zwischenergebnisse dürfen gern als separater Git commit vorliegen.
  Genauso wichtig wie das lauffähige Programm ist die Dokumentation (readme und code comments)
  der Lösungsidee und der einzelnen Programmteile und Tests.
  Das Hauptziel ist, dass wir erleben wie Sie Software in einem professionellen Umfeld entwickeln. Die
  gesamte Bearbeitungsdauer sollte max. 1-2 Tage betragen.
  
Aufgabe

  Implementieren Sie eine Funktion MERGE, die eine Liste von Intervallen entgegennimmt und als
  Ergebnis wiederum eine Liste von Intervallen zurückgibt. Im Ergebnis sollen alle sich überlappenden
  Intervalle gemerged sein. Alle nicht überlappenden Intervalle bleiben unberührt.
  Beispiel:
  Input: [25,30] [2,19] [14,23] [4,8]
  Output: [2,23] [25,30]
  Wie kann die Robustheit sichergestellt werden, vor allem auch mit Hinblick auf sehr große
  Eingaben?
  
Meine Antwort:

  Die Programmierung selbt hat sich halbe Stunde gedauert. Aber die Erstellung vom Projekt, der Test und die Dokumentation haben 1.5 Stunden gedauert.
  
  Time Complexity: O(nlogn)
  Space Complexity: O(n)
  
  O(nlogn) -> Die Sortierung braucht mehr Zeit dafür und es gibt keine Sortierungsmethode, welche ein Time Complexity kleiner als O(nlogn) hat. Deswegen es ist schon 
  robust bei sehr großen Eingaben.
  
