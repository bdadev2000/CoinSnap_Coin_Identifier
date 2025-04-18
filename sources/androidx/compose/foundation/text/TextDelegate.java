package androidx.compose.foundation.text;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.MultiParagraphIntrinsics;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.TextStyleKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.gms.common.api.Api;
import e0.w;
import java.util.List;

@Stable
/* loaded from: classes2.dex */
public final class TextDelegate {

    /* renamed from: a, reason: collision with root package name */
    public final AnnotatedString f6107a;

    /* renamed from: b, reason: collision with root package name */
    public final TextStyle f6108b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6109c;
    public final int d;
    public final boolean e;

    /* renamed from: f, reason: collision with root package name */
    public final int f6110f;

    /* renamed from: g, reason: collision with root package name */
    public final Density f6111g;

    /* renamed from: h, reason: collision with root package name */
    public final FontFamily.Resolver f6112h;

    /* renamed from: i, reason: collision with root package name */
    public final List f6113i;

    /* renamed from: j, reason: collision with root package name */
    public MultiParagraphIntrinsics f6114j;

    /* renamed from: k, reason: collision with root package name */
    public LayoutDirection f6115k;

    /* loaded from: classes2.dex */
    public static final class Companion {
    }

    public TextDelegate(AnnotatedString annotatedString, TextStyle textStyle, int i2, int i3, boolean z2, int i4, Density density, FontFamily.Resolver resolver, List list) {
        this.f6107a = annotatedString;
        this.f6108b = textStyle;
        this.f6109c = i2;
        this.d = i3;
        this.e = z2;
        this.f6110f = i4;
        this.f6111g = density;
        this.f6112h = resolver;
        this.f6113i = list;
        if (i2 <= 0) {
            throw new IllegalArgumentException("no maxLines".toString());
        }
        if (i3 <= 0) {
            throw new IllegalArgumentException("no minLines".toString());
        }
        if (i3 > i2) {
            throw new IllegalArgumentException("minLines greater than maxLines".toString());
        }
    }

    public final void a(LayoutDirection layoutDirection) {
        MultiParagraphIntrinsics multiParagraphIntrinsics = this.f6114j;
        if (multiParagraphIntrinsics == null || layoutDirection != this.f6115k || multiParagraphIntrinsics.a()) {
            this.f6115k = layoutDirection;
            multiParagraphIntrinsics = new MultiParagraphIntrinsics(this.f6107a, TextStyleKt.a(this.f6108b, layoutDirection), this.f6113i, this.f6111g, this.f6112h);
        }
        this.f6114j = multiParagraphIntrinsics;
    }

    public /* synthetic */ TextDelegate(AnnotatedString annotatedString, TextStyle textStyle, boolean z2, Density density, FontFamily.Resolver resolver) {
        this(annotatedString, textStyle, Api.BaseClientBuilder.API_PRIORITY_OTHER, 1, z2, 1, density, resolver, w.f30218a);
    }
}
