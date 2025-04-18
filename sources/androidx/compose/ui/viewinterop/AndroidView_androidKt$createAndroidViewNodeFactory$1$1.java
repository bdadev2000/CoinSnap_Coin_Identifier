package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.ui.node.Owner;
import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class AndroidView_androidKt$createAndroidViewNodeFactory$1$1 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f17574a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f17575b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CompositionContext f17576c;
    public final /* synthetic */ SaveableStateRegistry d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f17577f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ View f17578g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidView_androidKt$createAndroidViewNodeFactory$1$1(Context context, l lVar, CompositionContext compositionContext, SaveableStateRegistry saveableStateRegistry, int i2, View view) {
        super(0);
        this.f17574a = context;
        this.f17575b = lVar;
        this.f17576c = compositionContext;
        this.d = saveableStateRegistry;
        this.f17577f = i2;
        this.f17578g = view;
    }

    @Override // q0.a
    public final Object invoke() {
        Context context = this.f17574a;
        l lVar = this.f17575b;
        CompositionContext compositionContext = this.f17576c;
        SaveableStateRegistry saveableStateRegistry = this.d;
        int i2 = this.f17577f;
        KeyEvent.Callback callback = this.f17578g;
        p0.a.q(callback, "null cannot be cast to non-null type androidx.compose.ui.node.Owner");
        return new ViewFactoryHolder(context, lVar, compositionContext, saveableStateRegistry, i2, (Owner) callback).getLayoutNode();
    }
}
