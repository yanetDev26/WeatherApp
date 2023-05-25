package com.weatherapp.domain.weather

import androidx.annotation.DrawableRes
import com.weatherapp.R

sealed class WeatherType(
    val weatherDescription : String,
    @DrawableRes val iconResource : Int
) {
    object ClearSky : WeatherType(
        weatherDescription = "Cielo limpio",
        iconResource = R.drawable.ic_sunny
    )
    object MainlyClear : WeatherType(
        weatherDescription = "Principalmente claro",
        iconResource = R.drawable.ic_cloudy
    )
    object PartlyCloudy : WeatherType(
        weatherDescription = "Parcialmente nublado",
        iconResource = R.drawable.ic_cloudy
    )
    object Overcast : WeatherType(
        weatherDescription = "Nublado",
        iconResource = R.drawable.ic_cloudy
    )
    object Foggy : WeatherType(
        weatherDescription = "Neblinoso",
        iconResource = R.drawable.ic_very_cloudy
    )
    object DepositingRimeFog : WeatherType(
        weatherDescription = "Depositando niebla de escarcha",
        iconResource = R.drawable.ic_very_cloudy
    )
    object LightDrizzle : WeatherType(
        weatherDescription = "Llovizna ligera",
        iconResource = R.drawable.ic_rainshower
    )
    object ModerateDrizzle : WeatherType(
        weatherDescription = "Llovizna moderada",
        iconResource = R.drawable.ic_rainshower
    )
    object DenseDrizzle : WeatherType(
        weatherDescription = "Llovizna densa",
        iconResource = R.drawable.ic_rainshower
    )
    object LightFreezingDrizzle : WeatherType(
        weatherDescription = "Llovizna helada",
        iconResource = R.drawable.ic_snowyrainy
    )
    object DenseFreezingDrizzle : WeatherType(
        weatherDescription = "Llovizna helada densa",
        iconResource = R.drawable.ic_snowyrainy
    )
    object SlightRain : WeatherType(
        weatherDescription = "Lluvia ligera",
        iconResource = R.drawable.ic_rainy
    )
    object ModerateRain : WeatherType(
        weatherDescription = "Lluvioso",
        iconResource = R.drawable.ic_rainy
    )
    object HeavyRain : WeatherType(
        weatherDescription = "Fuerte lluvia",
        iconResource = R.drawable.ic_rainy
    )
    object HeavyFreezingRain : WeatherType(
        weatherDescription = "Fuerte lluvia helada",
        iconResource = R.drawable.ic_snowyrainy
    )
    object SlightSnowFall : WeatherType(
        weatherDescription = "Caída ligera de nieve",
        iconResource = R.drawable.ic_snowy
    )
    object ModerateSnowFall : WeatherType(
        weatherDescription = "Caída de nieve moderada",
        iconResource = R.drawable.ic_heavysnow
    )
    object HeavySnowFall : WeatherType(
        weatherDescription = "Fuerte nevada",
        iconResource = R.drawable.ic_heavysnow
    )
    object SnowGrains : WeatherType(
        weatherDescription = "Granos de nieve",
        iconResource = R.drawable.ic_heavysnow
    )
    object SlightRainShowers : WeatherType(
        weatherDescription = "Lluvias ligeras",
        iconResource = R.drawable.ic_rainshower
    )
    object ModerateRainShowers : WeatherType(
        weatherDescription = "Lluvias moderadas",
        iconResource = R.drawable.ic_rainshower
    )
    object ViolentRainShowers : WeatherType(
        weatherDescription = "Lluvias violentas",
        iconResource = R.drawable.ic_rainshower
    )
    object SlightSnowShowers : WeatherType(
        weatherDescription = "Duchas de nieve liviana",
        iconResource = R.drawable.ic_snowy
    )
    object HeavySnowShowers : WeatherType(
        weatherDescription = "Fuertes chubascos de nieve",
        iconResource = R.drawable.ic_snowy
    )
    object ModerateThunderstorm : WeatherType(
        weatherDescription = "Tormenta moderada",
        iconResource = R.drawable.ic_thunder
    )
    object SlightHailThunderstorm : WeatherType(
        weatherDescription = "Tormenta con granizo leve",
        iconResource = R.drawable.ic_rainythunder
    )
    object HeavyHailThunderstorm : WeatherType(
        weatherDescription = "Tormenta con fuerte granizo",
        iconResource = R.drawable.ic_rainythunder
    )

    companion object {
        fun fromWMO(code: Int): WeatherType {
            return when(code) {
                0 -> ClearSky
                1 -> MainlyClear
                2 -> PartlyCloudy
                3 -> Overcast
                45 -> Foggy
                48 -> DepositingRimeFog
                51 -> LightDrizzle
                53 -> ModerateDrizzle
                55 -> DenseDrizzle
                56 -> LightFreezingDrizzle
                57 -> DenseFreezingDrizzle
                61 -> SlightRain
                63 -> ModerateRain
                65 -> HeavyRain
                66 -> LightFreezingDrizzle
                67 -> HeavyFreezingRain
                71 -> SlightSnowFall
                73 -> ModerateSnowFall
                75 -> HeavySnowFall
                77 -> SnowGrains
                80 -> SlightRainShowers
                81 -> ModerateRainShowers
                82 -> ViolentRainShowers
                85 -> SlightSnowShowers
                86 -> HeavySnowShowers
                95 -> ModerateThunderstorm
                96 -> SlightHailThunderstorm
                99 -> HeavyHailThunderstorm
                else -> ClearSky
            }
        }
    }
}