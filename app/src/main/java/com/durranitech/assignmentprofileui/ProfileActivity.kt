package com.example.profileapp

import android.app.Activity
import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.outlined.Edit
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.view.WindowCompat
import com.durranitech.assignmentprofileui.R

class ProfileActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AssignmentProfileUITheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    ProfileScreen()
                }
            }
        }
    }
}


val Purple80 = Color(0xFFD0BCFF)
val PurpleGrey80 = Color(0xFFCCC2DC)
val Pink80 = Color(0xFFEFB8C8)

val Purple40 = Color(0xFF6650a4)
val PurpleGrey40 = Color(0xFF625b71)
val Pink40 = Color(0xFF7D5260)

private val DarkColorScheme = darkColorScheme(
    primary = Purple80,
    secondary = PurpleGrey80,
    tertiary = Pink80
)

private val LightColorScheme = lightColorScheme(
    primary = Purple40,
    secondary = PurpleGrey40,
    tertiary = Pink40
)

val Typography = androidx.compose.material3.Typography(
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    )
)


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProfileScreen() {
    val darkBackgroundColor = Color(0xFF1A1A1A)
    val cardBackgroundColor = Color(0xFF2A2A2A)
    val rewardsBackgroundColor = Color(0xFF0F0F0F) // Darker background for rewards section
    val textPrimaryColor = Color.White
    val textSecondaryColor = Color(0xFF888888)
    val accentColor = Color(0xFF4CAF50)

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(darkBackgroundColor)
            .statusBarsPadding()
    ) {
        // Top Bar
        TopAppBar(
            title = {
                Text(
                    text = "Profile",
                    color = textPrimaryColor,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Medium
                )
            },
            navigationIcon = {
                IconButton(onClick = { }) {
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = "Back",
                        tint = textPrimaryColor
                    )
                }
            },
            actions = {
                OutlinedButton(
                    onClick = { },
                    colors = ButtonDefaults.outlinedButtonColors(
                        contentColor = textSecondaryColor
                    ),
                    border = androidx.compose.foundation.BorderStroke(1.dp, textSecondaryColor),
                    modifier = Modifier.padding(end = 16.dp)
                ) {
                    Icon(
                        imageVector = Icons.Default.Email,
                        contentDescription = "Support",
                        modifier = Modifier.size(16.dp)
                    )
                    Spacer(modifier = Modifier.width(4.dp))
                    Text("support", fontSize = 14.sp)
                }
            },
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = darkBackgroundColor
            )
        )

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                // Profile Image
                Box(
                    modifier = Modifier
                        .size(80.dp)
                        .clip(CircleShape)
                        .background(Color.Gray)
                ) {
                    // Placeholder for profile image
                    Icon(
                        imageVector = Icons.Default.Person,
                        contentDescription = "Profile",
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(16.dp),
                        tint = Color.White
                    )
                }

                Spacer(modifier = Modifier.width(16.dp))

                Column(modifier = Modifier.weight(1f)) {
                    Text(
                        text = "andaz Kumar",
                        color = textPrimaryColor,
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Medium
                    )
                    Text(
                        text = "member since Dec, 2020",
                        color = textSecondaryColor,
                        fontSize = 14.sp
                    )
                }

                IconButton(
                    onClick = { },
                    modifier = Modifier
                        .size(40.dp)
                        .background(
                            color = Color.Transparent,
                            shape = CircleShape
                        )
                        .border(
                            width = 1.dp,
                            color = Color(0xFF404040),
                            shape = CircleShape
                        )
                ) {
                    Icon(
                        imageVector = Icons.Outlined.Edit,
                        contentDescription = "Edit",
                        tint = textSecondaryColor,
                        modifier = Modifier.size(20.dp)
                    )
                }
            }

            Spacer(modifier = Modifier.height(24.dp))

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable { },
                colors = CardDefaults.cardColors(
                    containerColor = cardBackgroundColor
                ),
                shape = RoundedCornerShape(12.dp),
                border = androidx.compose.foundation.BorderStroke(
                    width = 1.dp,
                    color = Color(0xFF404040)
                )
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    IconButton(
                        onClick = { },
                        modifier = Modifier
                            .size(30.dp)
                            .background(
                                color = Color.Transparent,
                                shape = CircleShape
                            )
                            .border(
                                width = 1.dp,
                                color = Color.White,
                                shape = CircleShape
                            )
                    ) {
                        Image(painterResource(id = R.drawable.car), contentDescription = "car", modifier = Modifier.size(30.dp))
                    }

                    Spacer(modifier = Modifier.width(16.dp))

                    Column(modifier = Modifier.weight(1f)) {
                        Text(
                            text = "get to know your vehicles, inside out",
                            color = textSecondaryColor,
                            fontSize = 12.sp
                        )
                        Row(horizontalArrangement = Arrangement.Center, verticalAlignment = Alignment.CenterVertically) {
                            Text(
                                text = "CRED garage",
                                color = textPrimaryColor,
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Medium
                            )
                            Spacer(Modifier.width(12.dp))
                            Icon(
                                imageVector = Icons.Default.ArrowForward,
                                contentDescription = "Arrow",
                                tint = textSecondaryColor,
                                modifier = Modifier.size(18.dp)
                            )
                        }

                    }


                }
            }
        }

        // Menu Items
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
        ) {
            ProfileMenuItem(
                icon = Icons.Default.Edit,
                title = "credit score",
                subtitle = "   REFRESH AVAILABLE",
                value = "757",
                subtitleColor = accentColor,
                onClick = { }
            )

            ProfileMenuItem(
                icon = Icons.Default.Edit,
                title = "lifetime cashback",
                value = "₹3",
                onClick = { }
            )

            ProfileMenuItem(
                icon = Icons.Default.Edit,
                title = "bank balance",
                value = "check",
                onClick = { }
            )
        }

        Spacer(modifier = Modifier.height(24.dp))

        // Rewards Section with darker background
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(rewardsBackgroundColor)
                .padding(vertical = 24.dp)
        ) {
            Text(
                text = "YOUR REWARDS & BENEFITS",
                color = Color(0xFF666666),
                fontSize = 16.sp,
                fontWeight = FontWeight.Medium,
                modifier = Modifier.padding(horizontal = 16.dp)
            )

            Spacer(modifier = Modifier.height(16.dp))

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp)
            ) {
                RewardItem(
                    title = "cashback balance",
                    value = "₹0",
                    onClick = { },
                    isShowDivider = true
                )

                RewardItem(
                    title = "coins",
                    value = "26,46,583",
                    onClick = { },
                    isShowDivider = true
                )

                RewardItem(
                    title = "win upto Rs 1000",
                    subtitle = "refer and earn",
                    onClick = { },
                    isShowDivider = true
                )

                Text(
                    text = "TRANSACTIONS & SUPPORT",
                    color = Color(0xFF666666),
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Medium,
                )

                RewardItem(
                    title = "all transactions",
                    subtitle = "",
                    onClick = { },
                    isShowDivider = false
                )

            }
        }


    }
}
@Composable
fun ProfileMenuItem(
    icon: ImageVector,
    title: String,
    value: String,
    subtitle: String? = null,
    subtitleColor: Color = Color(0xFF888888),
    showDivider: Boolean = true,
    onClick: () -> Unit
) {
    Column {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .clickable { onClick() }
                .padding(vertical = 16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = icon,
                contentDescription = title,
                tint = Color.White,
                modifier = Modifier.size(24.dp)
            )

            Spacer(modifier = Modifier.width(16.dp))

            Row (modifier = Modifier.weight(1f)) {
                Text(
                    text = title,
                    color = Color.White,
                    fontSize = 16.sp
                )
                subtitle?.let {
                    Text(
                        text = it,
                        color = subtitleColor,
                        fontSize = 12.sp
                    )
                }
            }

            Text(
                text = value,
                color = Color.White,
                fontSize = 16.sp,
                fontWeight = FontWeight.Medium
            )

            Spacer(modifier = Modifier.width(8.dp))

            Icon(
                imageVector = Icons.AutoMirrored.Filled.ArrowForward,
                contentDescription = "Arrow",
                tint = Color(0xFF888888),
                modifier = Modifier.size(20.dp)
            )
        }

        if (showDivider) {
            HorizontalDivider(
                thickness = 1.dp,
                color = Color(0xFF333333)
            )
        }
    }
}

@Composable
fun RewardItem(
    title: String,
    value: String? = null,
    subtitle: String? = null,
    onClick: () -> Unit,
    isShowDivider: Boolean,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .clickable { onClick() }
            .padding(vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column(modifier = Modifier.weight(1f)) {
            Text(
                text = title,
                color = Color.White,
                fontSize = 16.sp
            )
            subtitle?.let {
                Text(
                    text = it,
                    color = Color(0xFF888888),
                    fontSize = 12.sp
                )
            }
            value?.let {
                Text(
                    text = it,
                    color = Color(0xFF666666),
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Medium
                )

                Spacer(modifier = Modifier.width(12.dp))
            }

            Spacer(modifier.height(12.dp))

            if (isShowDivider){
                HorizontalDivider(
                    thickness = 1.dp,
                    color = Color(0xFF333333)
                )
            }


        }


        Icon(
            imageVector = Icons.Default.KeyboardArrowRight,
            contentDescription = "Arrow",
            tint = Color(0xFF888888),
            modifier = Modifier.size(24.dp)
        )


    }
}

@Composable
fun AssignmentProfileUITheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }
    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as Activity).window
            window.statusBarColor = colorScheme.primary.toArgb()
            WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = darkTheme
        }
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}

@Preview(showBackground = true)
@Composable
fun ProfileScreenPreview() {
    AssignmentProfileUITheme {
        ProfileScreen()
    }
}