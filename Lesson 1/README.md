# Lesson 1
- [Lesson 1 - Build your first app](#lesson-1)
  * [Hello World](#hello-world)
  * [Part A: Your first interactive UI](#part-a--your-first-interactive-ui)
  * [Part B: The layout editor](#part-b--the-layout-editor)
  * [Text and scrolling views](#text-and-scrolling-views)

## Hello World
After you successfully install Android Studio, you will create, from a template, a new project for the Hello World app. This simple app displays the string "Hello World" on the screen of the Android virtual or physical device.

Here's what the finished app will look like:

<p align="center">
<img src="https://codelabs.developers.google.com/codelabs/android-training-hello-world/img/7d9f0ab03e4b7bdf.png" height="300" width="175">
</p>

## Part A: Your first interactive UI
The HelloToast app consists of two Button elements and one TextView. When the user taps the first Button, it displays a short message (a Toast) on the screen. Tapping the second Button increases a "click" counter displayed in the TextView, which starts at zero.

Here's what the finished app looks like:

<p align="center">
<img src="https://codelabs.developers.google.com/codelabs/android-training-layout-editor-part-a/img/9048846fe18c96b7.png" height="300" width="175">
</p>

## Part B: The layout editor
The Hello Toast app in a previous lesson uses ConstraintLayout to arrange the UI elements in the Activity layout, as shown in the figure below.

<p align="center">
<img src="https://codelabs.developers.google.com/codelabs/android-training-layout-editor-part-b/img/763a8c9297531c8d.png" height="300" width="175">
</p>

To gain more practice with ConstraintLayout, you will create a variant of this layout for horizontal orientation as shown in the figure below.

<p align="center">
<img src="https://codelabs.developers.google.com/codelabs/android-training-layout-editor-part-b/img/2b5d2e2da3dbac33.png" height="175" width="300">
</p>

You will also learn how to use baseline constraints and some of the alignment features of ConstraintLayout by creating another layout variant for tablet displays.

<p align="center">
<img src="https://codelabs.developers.google.com/codelabs/android-training-layout-editor-part-b/img/7a7e38f404c39fea.png" height="300" width="400">
</p>

You also learn about other ViewGroup subclasses such as LinearLayout and RelativeLayout, and change the Hello Toast app layout to use them.

## Text and scrolling views
The Scrolling Text app demonstrates the ScrollView UI component. ScrollView is a ViewGroup that in this example contains a TextView. It shows a lengthy page of text—in this case, a music album review—that the user can scroll vertically to read by swiping up and down. A scroll bar appears in the right margin. The app shows how you can use text formatted with minimal HTML tags for setting text to bold or italic, and with new-line characters to separate paragraphs. You can also include active web links in the text.

<p align="center">
<img src="https://codelabs.developers.google.com/codelabs/android-training-text-and-scrolling-views/img/7a5265ded9f5a41a.png" height="300" width="400">
</p>

In the above figure, the following appear:
1. An active web link embedded in free-form text
2. The scroll bar that appears when scrolling the text