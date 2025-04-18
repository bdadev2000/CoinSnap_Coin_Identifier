package androidx.compose.foundation.text;

import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import kotlin.jvm.internal.y;

/* loaded from: classes2.dex */
public /* synthetic */ class KeyMappingKt$defaultKeyMapping$1 extends y {

    /* renamed from: a, reason: collision with root package name */
    public static final KeyMappingKt$defaultKeyMapping$1 f6003a = new y(KeyEvent_androidKt.class, "isCtrlPressed", "isCtrlPressed-ZmokQxo(Landroid/view/KeyEvent;)Z", 1);

    @Override // kotlin.jvm.internal.y, x0.l
    public final Object get(Object obj) {
        return Boolean.valueOf(((KeyEvent) obj).f15514a.isCtrlPressed());
    }
}
