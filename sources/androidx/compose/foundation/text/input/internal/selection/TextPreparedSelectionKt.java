package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.text.StringHelpers_androidKt;
import androidx.compose.foundation.text.input.internal.IndexTransformationType;
import androidx.compose.foundation.text.input.internal.SelectionWedgeAffinity;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.foundation.text.input.internal.WedgeAffinity;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.text.TextRange;

/* loaded from: classes2.dex */
public final class TextPreparedSelectionKt {

    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[IndexTransformationType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[3] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[1] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static final int a(String str, int i2, boolean z2, TransformedTextFieldState transformedTextFieldState) {
        int a2 = z2 ? StringHelpers_androidKt.a(i2, str) : StringHelpers_androidKt.b(i2, str);
        if (a2 == -1) {
            return i2;
        }
        long e = transformedTextFieldState.e(a2);
        long g2 = transformedTextFieldState.g(e);
        int ordinal = ((TextRange.c(e) && TextRange.c(g2)) ? IndexTransformationType.f6414a : (TextRange.c(e) || TextRange.c(g2)) ? (!TextRange.c(e) || TextRange.c(g2)) ? IndexTransformationType.d : IndexTransformationType.f6415b : IndexTransformationType.f6416c).ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                WedgeAffinity wedgeAffinity = WedgeAffinity.f6669b;
                WedgeAffinity wedgeAffinity2 = WedgeAffinity.f6668a;
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = transformedTextFieldState.f6655g;
                if (z2) {
                    if (a2 == ((int) (g2 >> 32))) {
                        parcelableSnapshotMutableState.setValue(new SelectionWedgeAffinity(wedgeAffinity2));
                        return a2;
                    }
                    parcelableSnapshotMutableState.setValue(new SelectionWedgeAffinity(wedgeAffinity));
                    return i2;
                }
                if (a2 == ((int) (g2 & 4294967295L))) {
                    parcelableSnapshotMutableState.setValue(new SelectionWedgeAffinity(wedgeAffinity));
                    return a2;
                }
                parcelableSnapshotMutableState.setValue(new SelectionWedgeAffinity(wedgeAffinity2));
                return i2;
            }
            if (ordinal == 2) {
                return (int) (z2 ? g2 & 4294967295L : g2 >> 32);
            }
            if (ordinal != 3) {
                throw new RuntimeException();
            }
        }
        return a2;
    }
}
