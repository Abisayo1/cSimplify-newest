package com.abisayo.computerize1.data

import android.app.Activity
import android.content.Intent
import com.abisayo.computerize1.OxygenTherapy.OxygenTherapyFlashCardActivity
import com.abisayo.computerize1.admission.AdmissionFlashcardActivity
import com.abisayo.computerize1.assessment.AssessmentFlashCardActivity
import com.abisayo.computerize1.communication.CommunicationFlashcardActivity
import com.abisayo.computerize1.discharge.DischargeFlashcardActivity
import com.abisayo.computerize1.flashcard.FlashCard
import com.abisayo.computerize1.Algorithms.AlgorithmFlashcardActivity
import com.abisayo.computerize1.oxygenation.OxygenationFlashCardActivity
import com.abisayo.computerize1.roles.RolesFlashcardActivity
import com.abisayo.computerize1.Flowcharts.FlowchartsFlashcardActivity

fun Activity.startAlgorithmFlashcardActivity(flashCards: ArrayList<FlashCard>, item: Int){
    val activityIntent =
        Intent(this, AlgorithmFlashcardActivity::class.java)
    activityIntent.putExtra(Constants.EXTRA_FLASH_CARD, flashCards)
    activityIntent.putExtra("item", item)
    startActivity(activityIntent)
}

fun Activity.startTrendsFlashcardActivity(flashCards: ArrayList<FlashCard>){
    val activityIntent =
        Intent(this, FlowchartsFlashcardActivity::class.java)
    activityIntent.putExtra(Constants.EXTRA_FLASH_CARD, flashCards)
    startActivity(activityIntent)
}

fun Activity.startFlowChartActivity(flashCards: ArrayList<FlashCard>, item: Int){
    val activityIntent =
        Intent(this, FlowchartsFlashcardActivity::class.java)
    activityIntent.putExtra(Constants.EXTRA_FLASH_CARD, flashCards)
    activityIntent.putExtra("item", item)
    startActivity(activityIntent)
}

fun Activity.startRolesFlashcardActivity(flashCards: ArrayList<FlashCard>){
    val activityIntent =
        Intent(this, RolesFlashcardActivity::class.java)
    activityIntent.putExtra(Constants.EXTRA_FLASH_CARD, flashCards)
    startActivity(activityIntent)
}

fun Activity.startAssessmentFlashcardActivity(flashCards: ArrayList<FlashCard>){
    val activityIntent =
        Intent(this, AssessmentFlashCardActivity::class.java)
    activityIntent.putExtra(Constants.EXTRA_FLASH_CARD, flashCards)
    startActivity(activityIntent)
}

fun Activity.startAdmissionFlashcardActivity(flashCards: ArrayList<FlashCard>){
    val activityIntent =
        Intent(this, AdmissionFlashcardActivity::class.java)
    activityIntent.putExtra(Constants.EXTRA_FLASH_CARD, flashCards)
    startActivity(activityIntent)
}

fun Activity.startDischargeFlashcardActivity(flashCards: ArrayList<FlashCard>){
    val activityIntent =
        Intent(this, DischargeFlashcardActivity::class.java)
    activityIntent.putExtra(Constants.EXTRA_FLASH_CARD, flashCards)
    startActivity(activityIntent)
}

fun Activity.startCommunicationFlashcardActivity(flashCards: ArrayList<FlashCard>){
    val activityIntent =
        Intent(this, CommunicationFlashcardActivity::class.java)
    activityIntent.putExtra(Constants.EXTRA_FLASH_CARD, flashCards)
    startActivity(activityIntent)
}

fun Activity.startOxygenationFlashCardActivity(flashCards: ArrayList<FlashCard>){
    val activityIntent =
        Intent(this, OxygenationFlashCardActivity::class.java)
    activityIntent.putExtra(Constants.EXTRA_FLASH_CARD, flashCards)
    startActivity(activityIntent)
}

fun Activity.startOxygenTherapyFlashCardActivity(flashCards: ArrayList<FlashCard>){
    val activityIntent =
        Intent(this, OxygenTherapyFlashCardActivity::class.java)
    activityIntent.putExtra(Constants.EXTRA_FLASH_CARD, flashCards)
    startActivity(activityIntent)
}