package androidx.compose.foundation.text.input.internal;

import android.view.View;
import kotlin.jvm.internal.o;
import q0.l;

/* loaded from: classes2.dex */
public /* synthetic */ class LegacyPlatformTextInputServiceAdapter_androidKt$inputMethodManagerFactory$1 extends o implements l {

    /* renamed from: a, reason: collision with root package name */
    public static final LegacyPlatformTextInputServiceAdapter_androidKt$inputMethodManagerFactory$1 f6448a = new o(1, InputMethodManagerImpl.class, "<init>", "<init>(Landroid/view/View;)V", 0);

    @Override // q0.l
    public final Object invoke(Object obj) {
        return new InputMethodManagerImpl((View) obj);
    }
}
