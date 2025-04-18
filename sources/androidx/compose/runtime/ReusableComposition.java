package androidx.compose.runtime;

import androidx.compose.runtime.internal.ComposableLambdaImpl;

/* loaded from: classes4.dex */
public interface ReusableComposition extends Composition {
    void deactivate();

    void t(ComposableLambdaImpl composableLambdaImpl);
}
