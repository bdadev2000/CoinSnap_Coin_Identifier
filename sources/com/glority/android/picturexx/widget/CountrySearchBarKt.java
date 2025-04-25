package com.glority.android.picturexx.widget;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.Metadata;

/* compiled from: CountrySearchBar.kt */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\u001ae\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\tH\u0007¢\u0006\u0002\u0010\u000e¨\u0006\u000f²\u0006\n\u0010\u0010\u001a\u00020\u0011X\u008a\u008e\u0002"}, d2 = {"CountrySearchBar", "", "modifier", "Landroidx/compose/ui/Modifier;", "countrySearchBarState", "Lcom/glority/android/picturexx/widget/CountrySearchBarState;", "focused", "", "onSearchSearchForce", "Lkotlin/Function1;", "onSearchFlagClick", "Lkotlin/Function0;", "onSearchContext", "", "(Landroidx/compose/ui/Modifier;Lcom/glority/android/picturexx/widget/CountrySearchBarState;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "businessMod_release", "textFieldValue", "Landroidx/compose/ui/text/input/TextFieldValue;"}, k = 2, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class CountrySearchBarKt {
    /* JADX WARN: Removed duplicated region for block: B:102:0x0585  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x05c7  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x062a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0683  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x06a7  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x06b8  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x04be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void CountrySearchBar(androidx.compose.ui.Modifier r41, final com.glority.android.picturexx.widget.CountrySearchBarState r42, boolean r43, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r44, kotlin.jvm.functions.Function0<kotlin.Unit> r45, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r46, androidx.compose.runtime.Composer r47, final int r48, final int r49) {
        /*
            Method dump skipped, instructions count: 1740
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.picturexx.widget.CountrySearchBarKt.CountrySearchBar(androidx.compose.ui.Modifier, com.glority.android.picturexx.widget.CountrySearchBarState, boolean, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final TextFieldValue CountrySearchBar$lambda$1(MutableState<TextFieldValue> mutableState) {
        return mutableState.getValue();
    }
}
