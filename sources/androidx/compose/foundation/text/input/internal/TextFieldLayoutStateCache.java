package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.snapshots.StateObject;
import androidx.compose.runtime.snapshots.StateRecord;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextMeasurer;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.gms.common.api.Api;
import z0.m;

@StabilityInferred
/* loaded from: classes.dex */
public final class TextFieldLayoutStateCache implements State<TextLayoutResult>, StateObject {

    /* renamed from: c, reason: collision with root package name */
    public TextMeasurer f6618c;

    /* renamed from: a, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f6616a = SnapshotStateKt.f(null, NonMeasureInputs.e);

    /* renamed from: b, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f6617b = SnapshotStateKt.f(null, MeasureInputs.f6628g);
    public CacheRecord d = new CacheRecord();

    /* loaded from: classes.dex */
    public static final class CacheRecord extends StateRecord {

        /* renamed from: c, reason: collision with root package name */
        public CharSequence f6619c;
        public TextRange d;
        public TextStyle e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f6620f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f6621g;

        /* renamed from: j, reason: collision with root package name */
        public LayoutDirection f6624j;

        /* renamed from: k, reason: collision with root package name */
        public FontFamily.Resolver f6625k;

        /* renamed from: m, reason: collision with root package name */
        public TextLayoutResult f6627m;

        /* renamed from: h, reason: collision with root package name */
        public float f6622h = Float.NaN;

        /* renamed from: i, reason: collision with root package name */
        public float f6623i = Float.NaN;

        /* renamed from: l, reason: collision with root package name */
        public long f6626l = ConstraintsKt.b(0, 0, 15);

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public final void a(StateRecord stateRecord) {
            p0.a.q(stateRecord, "null cannot be cast to non-null type androidx.compose.foundation.text.input.internal.TextFieldLayoutStateCache.CacheRecord");
            CacheRecord cacheRecord = (CacheRecord) stateRecord;
            this.f6619c = cacheRecord.f6619c;
            this.d = cacheRecord.d;
            this.e = cacheRecord.e;
            this.f6620f = cacheRecord.f6620f;
            this.f6621g = cacheRecord.f6621g;
            this.f6622h = cacheRecord.f6622h;
            this.f6623i = cacheRecord.f6623i;
            this.f6624j = cacheRecord.f6624j;
            this.f6625k = cacheRecord.f6625k;
            this.f6626l = cacheRecord.f6626l;
            this.f6627m = cacheRecord.f6627m;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public final StateRecord b() {
            return new CacheRecord();
        }

        public final String toString() {
            return "CacheRecord(visualText=" + ((Object) this.f6619c) + ", composition=" + this.d + ", textStyle=" + this.e + ", singleLine=" + this.f6620f + ", softWrap=" + this.f6621g + ", densityValue=" + this.f6622h + ", fontScale=" + this.f6623i + ", layoutDirection=" + this.f6624j + ", fontFamilyResolver=" + this.f6625k + ", constraints=" + ((Object) Constraints.m(this.f6626l)) + ", layoutResult=" + this.f6627m + ')';
        }
    }

    /* loaded from: classes.dex */
    public static final class MeasureInputs {

        /* renamed from: g, reason: collision with root package name */
        public static final TextFieldLayoutStateCache$MeasureInputs$Companion$mutationPolicy$1 f6628g = new Object();

        /* renamed from: a, reason: collision with root package name */
        public final Density f6629a;

        /* renamed from: b, reason: collision with root package name */
        public final LayoutDirection f6630b;

        /* renamed from: c, reason: collision with root package name */
        public final FontFamily.Resolver f6631c;
        public final long d;
        public final float e;

        /* renamed from: f, reason: collision with root package name */
        public final float f6632f;

        /* loaded from: classes.dex */
        public static final class Companion {
        }

        public MeasureInputs(Density density, LayoutDirection layoutDirection, FontFamily.Resolver resolver, long j2) {
            this.f6629a = density;
            this.f6630b = layoutDirection;
            this.f6631c = resolver;
            this.d = j2;
            this.e = density.getDensity();
            this.f6632f = density.x1();
        }

        public final String toString() {
            return "MeasureInputs(density=" + this.f6629a + ", densityValue=" + this.e + ", fontScale=" + this.f6632f + ", layoutDirection=" + this.f6630b + ", fontFamilyResolver=" + this.f6631c + ", constraints=" + ((Object) Constraints.m(this.d)) + ')';
        }
    }

    /* loaded from: classes.dex */
    public static final class NonMeasureInputs {
        public static final TextFieldLayoutStateCache$NonMeasureInputs$Companion$mutationPolicy$1 e = new Object();

        /* renamed from: a, reason: collision with root package name */
        public final TransformedTextFieldState f6633a;

        /* renamed from: b, reason: collision with root package name */
        public final TextStyle f6634b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f6635c;
        public final boolean d;

        /* loaded from: classes.dex */
        public static final class Companion {
        }

        public NonMeasureInputs(TransformedTextFieldState transformedTextFieldState, TextStyle textStyle, boolean z2, boolean z3) {
            this.f6633a = transformedTextFieldState;
            this.f6634b = textStyle;
            this.f6635c = z2;
            this.d = z3;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NonMeasureInputs(textFieldState=");
            sb.append(this.f6633a);
            sb.append(", textStyle=");
            sb.append(this.f6634b);
            sb.append(", singleLine=");
            sb.append(this.f6635c);
            sb.append(", softWrap=");
            return android.support.v4.media.d.s(sb, this.d, ')');
        }
    }

    public final TextLayoutResult a(NonMeasureInputs nonMeasureInputs, MeasureInputs measureInputs) {
        CharSequence charSequence;
        TextFieldCharSequence d = nonMeasureInputs.f6633a.d();
        CacheRecord cacheRecord = (CacheRecord) SnapshotKt.i(this.d);
        TextLayoutResult textLayoutResult = cacheRecord.f6627m;
        if (textLayoutResult != null && (charSequence = cacheRecord.f6619c) != null && m.O0(charSequence, d) && p0.a.g(cacheRecord.d, d.f6299c) && cacheRecord.f6620f == nonMeasureInputs.f6635c && cacheRecord.f6621g == nonMeasureInputs.d && cacheRecord.f6624j == measureInputs.f6630b && cacheRecord.f6622h == measureInputs.f6629a.getDensity() && cacheRecord.f6623i == measureInputs.f6629a.x1() && Constraints.c(cacheRecord.f6626l, measureInputs.d) && p0.a.g(cacheRecord.f6625k, measureInputs.f6631c) && !textLayoutResult.f17047b.f16911a.a()) {
            TextStyle textStyle = cacheRecord.e;
            boolean d2 = textStyle != null ? textStyle.d(nonMeasureInputs.f6634b) : false;
            TextStyle textStyle2 = cacheRecord.e;
            boolean c2 = textStyle2 != null ? textStyle2.c(nonMeasureInputs.f6634b) : false;
            if (d2 && c2) {
                return textLayoutResult;
            }
            if (d2) {
                TextLayoutInput textLayoutInput = textLayoutResult.f17046a;
                return new TextLayoutResult(new TextLayoutInput(textLayoutInput.f17038a, nonMeasureInputs.f6634b, textLayoutInput.f17040c, textLayoutInput.d, textLayoutInput.e, textLayoutInput.f17041f, textLayoutInput.f17042g, textLayoutInput.f17043h, textLayoutInput.f17044i, textLayoutInput.f17045j), textLayoutResult.f17047b, textLayoutResult.f17048c);
            }
        }
        TextMeasurer textMeasurer = this.f6618c;
        if (textMeasurer == null) {
            textMeasurer = new TextMeasurer(measureInputs.f6631c, measureInputs.f6629a, measureInputs.f6630b, 1);
            this.f6618c = textMeasurer;
        }
        TextMeasurer textMeasurer2 = textMeasurer;
        AnnotatedString.Builder builder = new AnnotatedString.Builder();
        builder.c(d.f6297a.toString());
        TextRange textRange = d.f6299c;
        if (textRange != null) {
            builder.a(new SpanStyle(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, TextDecoration.f17465c, null, 61439), TextRange.f(textRange.f17058a), TextRange.e(textRange.f17058a));
        }
        TextLayoutResult a2 = TextMeasurer.a(textMeasurer2, builder.f(), nonMeasureInputs.f6634b, 0, nonMeasureInputs.d, nonMeasureInputs.f6635c ? 1 : Api.BaseClientBuilder.API_PRIORITY_OTHER, measureInputs.d, measureInputs.f6630b, measureInputs.f6629a, measureInputs.f6631c, 1060);
        if (!p0.a.g(a2, textLayoutResult)) {
            Snapshot k2 = SnapshotKt.k();
            if (!k2.g()) {
                CacheRecord cacheRecord2 = this.d;
                synchronized (SnapshotKt.f14571b) {
                    CacheRecord cacheRecord3 = (CacheRecord) SnapshotKt.w(cacheRecord2, this, k2);
                    cacheRecord3.f6619c = d;
                    cacheRecord3.d = d.f6299c;
                    cacheRecord3.f6620f = nonMeasureInputs.f6635c;
                    cacheRecord3.f6621g = nonMeasureInputs.d;
                    cacheRecord3.e = nonMeasureInputs.f6634b;
                    cacheRecord3.f6624j = measureInputs.f6630b;
                    cacheRecord3.f6622h = measureInputs.e;
                    cacheRecord3.f6623i = measureInputs.f6632f;
                    cacheRecord3.f6626l = measureInputs.d;
                    cacheRecord3.f6625k = measureInputs.f6631c;
                    cacheRecord3.f6627m = a2;
                }
                SnapshotKt.n(k2, this);
            }
        }
        return a2;
    }

    @Override // androidx.compose.runtime.State
    public final Object getValue() {
        MeasureInputs measureInputs;
        NonMeasureInputs nonMeasureInputs = (NonMeasureInputs) this.f6616a.getValue();
        if (nonMeasureInputs == null || (measureInputs = (MeasureInputs) this.f6617b.getValue()) == null) {
            return null;
        }
        return a(nonMeasureInputs, measureInputs);
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public final void p(StateRecord stateRecord) {
        this.d = (CacheRecord) stateRecord;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public final StateRecord q() {
        return this.d;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public final StateRecord r(StateRecord stateRecord, StateRecord stateRecord2, StateRecord stateRecord3) {
        return stateRecord3;
    }
}
