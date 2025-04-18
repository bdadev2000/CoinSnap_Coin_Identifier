package androidx.compose.ui.text;

import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.platform.AndroidParagraphIntrinsics;
import androidx.compose.ui.unit.Density;
import com.google.android.gms.common.api.Api;
import e0.w;

/* loaded from: classes4.dex */
public final class ParagraphKt {
    public static AndroidParagraph a(String str, TextStyle textStyle, long j2, Density density, FontFamily.Resolver resolver, w wVar, int i2, int i3) {
        int i4 = i3 & 32;
        w wVar2 = w.f30218a;
        w wVar3 = i4 != 0 ? wVar2 : wVar;
        if ((i3 & 64) == 0) {
            wVar2 = null;
        }
        return new AndroidParagraph(new AndroidParagraphIntrinsics(textStyle, resolver, density, str, wVar3, wVar2), (i3 & 128) != 0 ? Api.BaseClientBuilder.API_PRIORITY_OTHER : i2, false, j2);
    }
}
