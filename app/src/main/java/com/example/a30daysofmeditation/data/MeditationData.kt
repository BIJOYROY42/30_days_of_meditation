package com.example.a30daysofmeditation.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.a30daysofmeditation.R

data class MeditationDay(
    val id: Int,
    val day: Int,
    val title: String,
    val description: String,
    val duration: Int, // in minutes
    val type: String
)

object MeditationDataSource {
    val meditationDays = listOf(
        MeditationDay(
            id = 1,
            day = 1,
            title = "Breath Awareness",
            description = "Focus on your breath. Notice the sensation of air flowing in and out of your lungs.",
            duration = 5,
            type = "Mindfulness"
        ),
        MeditationDay(
            id = 2,
            day = 2,
            title = "Body Scan",
            description = "Bring awareness to each part of your body, from your toes to the top of your head.",
            duration = 7,
            type = "Awareness"
        ),
        MeditationDay(
            id = 3,
            day = 3,
            title = "Loving-Kindness",
            description = "Generate feelings of love and compassion for yourself and others.",
            duration = 8,
            type = "Compassion"
        ),
        MeditationDay(
            id = 4,
            day = 4,
            title = "Mindful Listening",
            description = "Focus on the sounds around you without judging or analyzing them.",
            duration = 6,
            type = "Awareness"
        ),
        MeditationDay(
            id = 5,
            day = 5,
            title = "Gratitude Practice",
            description = "Reflect on things you're grateful for in your life.",
            duration = 10,
            type = "Gratitude"
        ),
        MeditationDay(
            id = 6,
            day = 6,
            title = "Visualization",
            description = "Imagine a peaceful place where you feel safe and relaxed.",
            duration = 9,
            type = "Visualization"
        ),
        MeditationDay(
            id = 7,
            day = 7,
            title = "Mindful Walking",
            description = "Focus on the sensations in your feet and legs as you walk slowly.",
            duration = 12,
            type = "Movement"
        ),
        MeditationDay(
            id = 8,
            day = 8,
            title = "Counting Breaths",
            description = "Count each breath cycle from 1 to 10, then start over.",
            duration = 7,
            type = "Concentration"
        ),
        MeditationDay(
            id = 9,
            day = 9,
            title = "Thought Observation",
            description = "Watch your thoughts come and go without getting caught up in them.",
            duration = 8,
            type = "Mindfulness"
        ),
        MeditationDay(
            id = 10,
            day = 10,
            title = "Chakra Meditation",
            description = "Focus on each of the seven energy centers in your body.",
            duration = 15,
            type = "Energy"
        ),
        MeditationDay(
            id = 11,
            day = 11,
            title = "Mantra Meditation",
            description = "Repeat a calming word or phrase silently to yourself.",
            duration = 10,
            type = "Concentration"
        ),
        MeditationDay(
            id = 12,
            day = 12,
            title = "Forgiveness Practice",
            description = "Cultivate forgiveness toward yourself and others who have hurt you.",
            duration = 12,
            type = "Healing"
        ),
        MeditationDay(
            id = 13,
            day = 13,
            title = "Five Senses Awareness",
            description = "Notice what you can see, hear, smell, taste, and feel.",
            duration = 9,
            type = "Sensory"
        ),
        MeditationDay(
            id = 14,
            day = 14,
            title = "Progressive Relaxation",
            description = "Systematically tense and relax each muscle group in your body.",
            duration = 11,
            type = "Relaxation"
        ),
        MeditationDay(
            id = 15,
            day = 15,
            title = "Mindful Eating",
            description = "Eat a small piece of food with complete awareness of taste and texture.",
            duration = 8,
            type = "Mindfulness"
        ),
        MeditationDay(
            id = 16,
            day = 16,
            title = "Self-Compassion",
            description = "Offer yourself the same kindness you would give to a good friend.",
            duration = 10,
            type = "Compassion"
        ),
        MeditationDay(
            id = 17,
            day = 17,
            title = "Sound Bath",
            description = "Immerse yourself in healing sounds and vibrations.",
            duration = 15,
            type = "Sound"
        ),
        MeditationDay(
            id = 18,
            day = 18,
            title = "Mountain Meditation",
            description = "Visualize yourself as a mountain—solid, stable, and unmoving.",
            duration = 9,
            type = "Visualization"
        ),
        MeditationDay(
            id = 19,
            day = 19,
            title = "Breath Counting",
            description = "Count your breaths from 1 to 4, then start over.",
            duration = 7,
            type = "Concentration"
        ),
        MeditationDay(
            id = 20,
            day = 20,
            title = "Heartbeat Meditation",
            description = "Tune into the rhythm of your heartbeat and feel gratitude for it.",
            duration = 8,
            type = "Awareness"
        ),
        MeditationDay(
            id = 21,
            day = 21,
            title = "Letting Go Practice",
            description = "Identify something you're holding onto and practice releasing it.",
            duration = 12,
            type = "Release"
        ),
        MeditationDay(
            id = 22,
            day = 22,
            title = "Mindful Movement",
            description = "Do simple stretches with complete awareness of bodily sensations.",
            duration = 10,
            type = "Movement"
        ),
        MeditationDay(
            id = 23,
            day = 23,
            title = "Candle Gazing",
            description = "Focus your attention on the flame of a candle.",
            duration = 8,
            type = "Concentration"
        ),
        MeditationDay(
            id = 24,
            day = 24,
            title = "Inner Smile",
            description = "Smile inwardly to each organ in your body, sending loving energy.",
            duration = 11,
            type = "Energy"
        ),
        MeditationDay(
            id = 25,
            day = 25,
            title = "Cloud Watching",
            description = "Imagine yourself watching clouds pass by in the sky of your mind.",
            duration = 9,
            type = "Visualization"
        ),
        MeditationDay(
            id = 26,
            day = 26,
            title = "Three-Part Breath",
            description = "Breathe fully into your belly, chest, and upper chest.",
            duration = 7,
            type = "Breathwork"
        ),
        MeditationDay(
            id = 27,
            day = 27,
            title = "Compassion for Suffering",
            description = "Send compassionate thoughts to those who are suffering.",
            duration = 10,
            type = "Compassion"
        ),
        MeditationDay(
            id = 28,
            day = 28,
            title = "Grounding Practice",
            description = "Feel your connection to the earth and draw strength from it.",
            duration = 8,
            type = "Grounding"
        ),
        MeditationDay(
            id = 29,
            day = 29,
            title = "Reflection on Growth",
            description = "Reflect on your journey and growth through these meditation practices.",
            duration = 12,
            type = "Reflection"
        ),
        MeditationDay(
            id = 30,
            day = 30,
            title = "Intention Setting",
            description = "Set intentions for continuing your meditation practice beyond these 30 days.",
            duration = 15,
            type = "Intention"
        )
    )
} 