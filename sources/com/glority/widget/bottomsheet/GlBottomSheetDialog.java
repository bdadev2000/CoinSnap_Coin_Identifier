package com.glority.widget.bottomsheet;

import android.content.Context;
import android.os.Bundle;
import android.view.Display;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import com.glority.widget.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GlBottomSheetDialog.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u001f\u001a\u00020 H\u0003J\u0012\u0010!\u001a\u00020 2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0014J\b\u0010$\u001a\u00020 H\u0016J\b\u0010%\u001a\u00020 H\u0014J\b\u0010&\u001a\u00020 H\u0002J\u0019\u0010\f\u001a\u00020 2\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0000¢\u0006\u0004\b'\u0010\rJ\u001f\u0010\u0018\u001a\u00020 2\u0006\u0010(\u001a\u00020\u00062\b\b\u0002\u0010)\u001a\u00020\tH\u0000¢\u0006\u0002\b*J\u0015\u0010\u000f\u001a\u00020 2\u0006\u0010+\u001a\u00020\u0010H\u0000¢\u0006\u0002\b,R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006-"}, d2 = {"Lcom/glority/widget/bottomsheet/GlBottomSheetDialog;", "Lcom/google/android/material/bottomsheet/BottomSheetDialog;", "Landroidx/lifecycle/LifecycleObserver;", "ctx", "Landroid/content/Context;", "theme", "", "(Landroid/content/Context;I)V", "maxHeightRatio", "", "getMaxHeightRatio", "()Ljava/lang/Float;", "setMaxHeightRatio", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "showDimBehind", "", "getShowDimBehind", "()Z", "setShowDimBehind", "(Z)V", "showMod", "getShowMod", "()I", "setShowMod", "(I)V", "showRadio", "getShowRadio", "()F", "setShowRadio", "(F)V", "destroy", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDetachedFromWindow", "onStart", "setConfig", "setMaxHeightRatio$mod_release", "mod", "ratio", "setShowMod$mod_release", "show", "showDimBehind$mod_release", "mod_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes12.dex */
public final class GlBottomSheetDialog extends BottomSheetDialog implements LifecycleObserver {
    private final Context ctx;
    private Float maxHeightRatio;
    private boolean showDimBehind;
    private int showMod;
    private float showRadio;

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    private final void destroy() {
    }

    public /* synthetic */ GlBottomSheetDialog(Context context, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? R.style.GlBottomSheetStyle : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public GlBottomSheetDialog(Context ctx, int i) {
        super(ctx, i);
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        this.ctx = ctx;
        this.showMod = 3;
        if (ctx instanceof Lifecycle) {
            ((Lifecycle) ctx).addObserver(this);
        }
    }

    public final Float getMaxHeightRatio() {
        return this.maxHeightRatio;
    }

    public final void setMaxHeightRatio(Float f) {
        this.maxHeightRatio = f;
    }

    public final boolean getShowDimBehind() {
        return this.showDimBehind;
    }

    public final void setShowDimBehind(boolean z) {
        this.showDimBehind = z;
    }

    public final int getShowMod() {
        return this.showMod;
    }

    public final void setShowMod(int i) {
        this.showMod = i;
    }

    public final float getShowRadio() {
        return this.showRadio;
    }

    public final void setShowRadio(float f) {
        this.showRadio = f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.material.bottomsheet.BottomSheetDialog, androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Object systemService = this.ctx.getSystemService("window");
        if (systemService == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager");
        }
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        Intrinsics.checkNotNullExpressionValue(defaultDisplay, "(ctx.getSystemService(Co…owManager).defaultDisplay");
        int height = defaultDisplay.getHeight();
        if (this.maxHeightRatio != null) {
            Window window = getWindow();
            if (window != null) {
                Float f = this.maxHeightRatio;
                Intrinsics.checkNotNull(f);
                window.setLayout(-1, (int) (height * f.floatValue()));
            }
            Window window2 = getWindow();
            if (window2 != null) {
                window2.setGravity(80);
            }
        }
    }

    public final void setMaxHeightRatio$mod_release(Float maxHeightRatio) {
        this.maxHeightRatio = maxHeightRatio;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.material.bottomsheet.BottomSheetDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void onStart() {
        super.onStart();
        setConfig();
    }

    public final void showDimBehind$mod_release(boolean show) {
        this.showDimBehind = show;
        if (show) {
            Window window = getWindow();
            if (window != null) {
                window.addFlags(2);
                return;
            }
            return;
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.clearFlags(2);
        }
    }

    public static /* synthetic */ void setShowMod$mod_release$default(GlBottomSheetDialog glBottomSheetDialog, int i, float f, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            f = 0.0f;
        }
        glBottomSheetDialog.setShowMod$mod_release(i, f);
    }

    public final void setShowMod$mod_release(int mod, float ratio) {
        this.showMod = mod;
        this.showRadio = ratio;
        if (ratio != 0.0f) {
            BottomSheetBehavior<FrameLayout> behavior = getBehavior();
            Intrinsics.checkNotNullExpressionValue(behavior, "behavior");
            behavior.setState(6);
            BottomSheetBehavior<FrameLayout> behavior2 = getBehavior();
            Intrinsics.checkNotNullExpressionValue(behavior2, "behavior");
            behavior2.setHalfExpandedRatio(ratio);
            return;
        }
        BottomSheetBehavior<FrameLayout> behavior3 = getBehavior();
        Intrinsics.checkNotNullExpressionValue(behavior3, "behavior");
        behavior3.setState(mod);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialog, android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Object obj = this.ctx;
        if (obj instanceof Lifecycle) {
            ((Lifecycle) obj).removeObserver(this);
        }
    }

    private final void setConfig() {
        Window window;
        setShowMod$mod_release(this.showMod, this.showRadio);
        showDimBehind$mod_release(this.showDimBehind);
        if (!this.showDimBehind || (window = getWindow()) == null) {
            return;
        }
        window.setNavigationBarColor(0);
    }
}
