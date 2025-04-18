package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.unit.IntRect;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MutableState f9326a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1(MutableState mutableState) {
        super(2);
        this.f9326a = mutableState;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        this.f9326a.setValue(new TransformOrigin(MenuKt.c((IntRect) obj, (IntRect) obj2)));
        return b0.f30125a;
    }
}
