package androidx.compose.ui.text.platform;

import android.graphics.Typeface;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.TypefaceResult;
import kotlin.jvm.internal.r;
import p0.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class AndroidParagraphIntrinsics$resolveTypeface$1 extends r implements q0.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AndroidParagraphIntrinsics f17416a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidParagraphIntrinsics$resolveTypeface$1(AndroidParagraphIntrinsics androidParagraphIntrinsics) {
        super(4);
        this.f17416a = androidParagraphIntrinsics;
    }

    @Override // q0.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i2 = ((FontStyle) obj3).f17260a;
        int i3 = ((FontSynthesis) obj4).f17261a;
        AndroidParagraphIntrinsics androidParagraphIntrinsics = this.f17416a;
        TypefaceResult a2 = androidParagraphIntrinsics.e.a((FontFamily) obj, (FontWeight) obj2, i2, i3);
        if (a2 instanceof TypefaceResult.Immutable) {
            Object value = a2.getValue();
            a.q(value, "null cannot be cast to non-null type android.graphics.Typeface");
            return (Typeface) value;
        }
        TypefaceDirtyTrackerLinkedList typefaceDirtyTrackerLinkedList = new TypefaceDirtyTrackerLinkedList(a2, androidParagraphIntrinsics.f17413j);
        androidParagraphIntrinsics.f17413j = typefaceDirtyTrackerLinkedList;
        Object obj5 = typefaceDirtyTrackerLinkedList.f17435c;
        a.q(obj5, "null cannot be cast to non-null type android.graphics.Typeface");
        return (Typeface) obj5;
    }
}
