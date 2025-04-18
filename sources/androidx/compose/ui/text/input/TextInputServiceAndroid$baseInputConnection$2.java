package androidx.compose.ui.text.input;

import android.view.inputmethod.BaseInputConnection;
import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
final class TextInputServiceAndroid$baseInputConnection$2 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TextInputServiceAndroid f17384a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextInputServiceAndroid$baseInputConnection$2(TextInputServiceAndroid textInputServiceAndroid) {
        super(0);
        this.f17384a = textInputServiceAndroid;
    }

    @Override // q0.a
    public final Object invoke() {
        return new BaseInputConnection(this.f17384a.f17368a, false);
    }
}
