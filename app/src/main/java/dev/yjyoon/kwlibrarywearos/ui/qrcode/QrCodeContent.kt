package dev.yjyoon.kwlibrarywearos.ui.qrcode

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Settings
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.wear.compose.material.CompactButton
import androidx.wear.compose.material.Icon
import com.google.android.horologist.compose.layout.fillMaxRectangle
import dev.yjyoon.kwlibrarywearos.ui.util.QrCodeUtil.convertToQrCode

@Composable
fun QrCodeContent(
    qrcode: String,
    onSetting: () -> Unit
) {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            bitmap = qrcode.convertToQrCode().asImageBitmap(),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .align(Alignment.Center)
                .fillMaxRectangle()
                .clip(RoundedCornerShape(4.dp))
        )
        CompactButton(
            onClick = onSetting,
            modifier = Modifier.align(Alignment.BottomCenter)
        ) {
            Icon(imageVector = Icons.Default.Settings, contentDescription = null)
        }
    }
}