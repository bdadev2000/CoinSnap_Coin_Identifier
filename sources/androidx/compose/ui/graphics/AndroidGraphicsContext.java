package androidx.compose.ui.graphics;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.graphics.layer.GraphicsLayerImpl;
import androidx.compose.ui.graphics.layer.GraphicsLayerV23;
import androidx.compose.ui.graphics.layer.GraphicsLayerV29;
import androidx.compose.ui.graphics.layer.GraphicsViewLayer;
import androidx.compose.ui.graphics.layer.view.DrawChildContainer;
import androidx.compose.ui.graphics.layer.view.ViewLayerContainer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class AndroidGraphicsContext implements GraphicsContext {
    public static boolean d = true;

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f14929a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f14930b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public ViewLayerContainer f14931c;

    /* renamed from: androidx.compose.ui.graphics.AndroidGraphicsContext$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public final class AnonymousClass1 implements ComponentCallbacks2 {
        @Override // android.content.ComponentCallbacks
        public final void onConfigurationChanged(Configuration configuration) {
        }

        @Override // android.content.ComponentCallbacks
        public final void onLowMemory() {
        }

        @Override // android.content.ComponentCallbacks2
        public final void onTrimMemory(int i2) {
            if (i2 >= 40) {
                throw null;
            }
        }
    }

    /* renamed from: androidx.compose.ui.graphics.AndroidGraphicsContext$2, reason: invalid class name */
    /* loaded from: classes4.dex */
    public final class AnonymousClass2 implements View.OnAttachStateChangeListener {
        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            view.getContext();
            throw null;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            view.getContext();
            throw null;
        }
    }

    /* loaded from: classes2.dex */
    public static final class Companion {
    }

    @RequiresApi
    /* loaded from: classes2.dex */
    public static final class UniqueDrawingIdApi29 {
        @DoNotInline
        public static final long a(@NotNull View view) {
            long uniqueDrawingId;
            uniqueDrawingId = view.getUniqueDrawingId();
            return uniqueDrawingId;
        }
    }

    public AndroidGraphicsContext(ViewGroup viewGroup) {
        this.f14929a = viewGroup;
    }

    @Override // androidx.compose.ui.graphics.GraphicsContext
    public final GraphicsLayer a() {
        GraphicsLayerImpl graphicsViewLayer;
        GraphicsLayer graphicsLayer;
        synchronized (this.f14930b) {
            try {
                ViewGroup viewGroup = this.f14929a;
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 29) {
                    UniqueDrawingIdApi29.a(viewGroup);
                }
                if (i2 >= 29) {
                    graphicsViewLayer = new GraphicsLayerV29();
                } else if (d) {
                    try {
                        graphicsViewLayer = new GraphicsLayerV23(this.f14929a, new CanvasHolder(), new CanvasDrawScope());
                    } catch (Throwable unused) {
                        d = false;
                        graphicsViewLayer = new GraphicsViewLayer(c(this.f14929a));
                    }
                } else {
                    graphicsViewLayer = new GraphicsViewLayer(c(this.f14929a));
                }
                graphicsLayer = new GraphicsLayer(graphicsViewLayer);
            } catch (Throwable th) {
                throw th;
            }
        }
        return graphicsLayer;
    }

    @Override // androidx.compose.ui.graphics.GraphicsContext
    public final void b(GraphicsLayer graphicsLayer) {
        synchronized (this.f14930b) {
            if (!graphicsLayer.f15169r) {
                graphicsLayer.f15169r = true;
                graphicsLayer.b();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [androidx.compose.ui.graphics.layer.view.ViewLayerContainer, android.view.View, androidx.compose.ui.graphics.layer.view.DrawChildContainer, android.view.ViewGroup] */
    public final DrawChildContainer c(ViewGroup viewGroup) {
        ViewLayerContainer viewLayerContainer = this.f14931c;
        if (viewLayerContainer != null) {
            return viewLayerContainer;
        }
        ?? viewGroup2 = new ViewGroup(viewGroup.getContext());
        viewGroup2.setClipChildren(false);
        viewGroup2.setClipToPadding(false);
        viewGroup2.setTag(com.cooldev.gba.emulator.gameboy.R.id.hide_graphics_layer_in_inspector_tag, Boolean.TRUE);
        viewGroup.addView(viewGroup2);
        this.f14931c = viewGroup2;
        return viewGroup2;
    }
}
