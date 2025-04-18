package androidx.compose.ui.graphics.colorspace;

import androidx.collection.IntObjectMapKt;
import androidx.collection.MutableIntObjectMap;

/* loaded from: classes.dex */
public final class ConnectorKt {

    /* renamed from: a, reason: collision with root package name */
    public static final MutableIntObjectMap f15097a;

    static {
        Rgb rgb = ColorSpaces.f15075c;
        int i2 = rgb.f15072c;
        Connector connector = new Connector(rgb, rgb, 1);
        Oklab oklab = ColorSpaces.f15090t;
        int i3 = oklab.f15072c << 6;
        int i4 = rgb.f15072c;
        int i5 = i3 | i4;
        Connector connector2 = new Connector(rgb, oklab, 0);
        int i6 = (i4 << 6) | oklab.f15072c;
        Connector connector3 = new Connector(oklab, rgb, 0);
        MutableIntObjectMap mutableIntObjectMap = IntObjectMapKt.f1442a;
        MutableIntObjectMap mutableIntObjectMap2 = new MutableIntObjectMap();
        mutableIntObjectMap2.i(i2 | (i2 << 6), connector);
        mutableIntObjectMap2.i(i5, connector2);
        mutableIntObjectMap2.i(i6, connector3);
        f15097a = mutableIntObjectMap2;
    }
}
