package androidx.compose.foundation.text;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.res.StringResources_androidKt;
import kotlin.jvm.internal.r;
import q0.p;

/* loaded from: classes3.dex */
public final class ContextMenu_androidKt$TextItem$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TextContextMenuItems f5791a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContextMenu_androidKt$TextItem$1(TextContextMenuItems textContextMenuItems) {
        super(2);
        this.f5791a = textContextMenuItems;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        ((Number) obj2).intValue();
        composer.J(-1451087197);
        String a2 = StringResources_androidKt.a(this.f5791a.f6106a, composer);
        composer.D();
        return a2;
    }
}
