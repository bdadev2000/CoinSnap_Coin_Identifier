package androidx.compose.ui.graphics.layer;

import android.graphics.Bitmap;
import androidx.compose.ui.graphics.AndroidImageBitmap;
import h0.g;
import j0.c;
import j0.e;
import kotlin.jvm.internal.q;

@e(c = "androidx.compose.ui.graphics.layer.GraphicsLayer", f = "AndroidGraphicsLayer.android.kt", l = {847}, m = "toImageBitmap")
/* loaded from: classes.dex */
final class GraphicsLayer$toImageBitmap$1 extends c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f15174a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GraphicsLayer f15175b;

    /* renamed from: c, reason: collision with root package name */
    public int f15176c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GraphicsLayer$toImageBitmap$1(GraphicsLayer graphicsLayer, g gVar) {
        super(gVar);
        this.f15175b = graphicsLayer;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        GraphicsLayer$toImageBitmap$1 graphicsLayer$toImageBitmap$1;
        this.f15174a = obj;
        this.f15176c |= Integer.MIN_VALUE;
        GraphicsLayer graphicsLayer = this.f15175b;
        graphicsLayer.getClass();
        int i2 = this.f15176c;
        if ((i2 & Integer.MIN_VALUE) != 0) {
            this.f15176c = i2 - Integer.MIN_VALUE;
            graphicsLayer$toImageBitmap$1 = this;
        } else {
            graphicsLayer$toImageBitmap$1 = new GraphicsLayer$toImageBitmap$1(graphicsLayer, this);
        }
        Object obj2 = graphicsLayer$toImageBitmap$1.f15174a;
        i0.a aVar = i0.a.f30806a;
        int i3 = graphicsLayer$toImageBitmap$1.f15176c;
        if (i3 == 0) {
            q.m(obj2);
            graphicsLayer$toImageBitmap$1.f15176c = 1;
            obj2 = GraphicsLayer.f15153v.a(graphicsLayer, graphicsLayer$toImageBitmap$1);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.m(obj2);
        }
        return new AndroidImageBitmap((Bitmap) obj2);
    }
}
