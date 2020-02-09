# Lesson 2

- [Lesson 2 - Activities and intents](#lesson-2)
  * [Activities and intents](#activities-and-intents)
  * [Activity lifecycle and state](#activity-lifecycle-and-state)
  * [Implicit intents](#implicit-intents)

## Activities and intents
In this chapter you create and build an app called Two Activities that, unsurprisingly, contains two Activity implementations. You build the app in three stages.

In the first stage, you create an app whose main activity contains one button, Send. When the user clicks this button, your main activity uses an intent to start the second activity.

<p align="center">
<img src="https://codelabs.developers.google.com/codelabs/android-training-create-an-activity/img/170f0988e83e65fb.png" height="300" width="300">
</p>

In the second stage, you add an EditText view to the main activity. The user enters a message and clicks Send. The main activity uses an intent to start the second activity and send the user's message to the second activity. The second activity displays the message it received.

<p align="center">
<img src="https://codelabs.developers.google.com/codelabs/android-training-create-an-activity/img/703a750ac6e887c3.png" height="300" width="300">
</p>

In the final stage of creating the Two Activities app, you add an EditText and a Reply button to the second activity. The user can now type a reply message and tap Reply, and the reply is displayed on the main activity. At this point, you use an intent to pass the reply back from the second activity to the main activity.

<p align="center">
<img src="https://codelabs.developers.google.com/codelabs/android-training-create-an-activity/img/72c5f62669fa22af.png" height="300" width="500">
</p>

## Activity lifecycle and state

In this practical you add to the TwoActivities app. The app looks and behaves roughly the same as it did in the last codelab. It contains two Activity implementations and gives the user the ability to send between them. The changes you make to the app in this practical will not affect its visible user behavior.

## Implicit intents
In this section you create a new app with one Activity and three options for actions: open a web site, open a location on a map, and share a snippet of text. All of the text fields are editable (EditText), but contain default values.

<p align="center">
<img src="https://codelabs.developers.google.com/codelabs/android-training-activity-with-implicit-intent/img/c107664df46af7f6.png" height="300" width="175">
</p>