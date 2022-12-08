import SwiftUI
import shared

struct ContentView: View {
	let greet = Greeting().greet()
    let nn = Greeting().nameShow()

	var body: some View {
        Text(greet)
		Text(nn)
	}
}

struct ContentView_Previews: PreviewProvider {
	static var previews: some View {
		ContentView()
	}
}
