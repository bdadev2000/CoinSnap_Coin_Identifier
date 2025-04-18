package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation;
import androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.saveable.SaverKt$Saver$1;
import androidx.compose.ui.layout.Remeasurement;
import androidx.compose.ui.unit.IntOffsetKt;
import java.util.List;
import kotlin.jvm.internal.r;
import p0.a;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class LazyStaggeredGridState$scrollableState$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LazyStaggeredGridState f5080a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyStaggeredGridState$scrollableState$1(LazyStaggeredGridState lazyStaggeredGridState) {
        super(1);
        this.f5080a = lazyStaggeredGridState;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        float f2;
        LazyStaggeredGridState lazyStaggeredGridState;
        float f3;
        float f4;
        int i2;
        int i3;
        LazyStaggeredGridState lazyStaggeredGridState2;
        float f5;
        LazyStaggeredGridState lazyStaggeredGridState3;
        char c2;
        float f6;
        int intValue;
        float f7 = -((Number) obj).floatValue();
        SaverKt$Saver$1 saverKt$Saver$1 = LazyStaggeredGridState.f5048u;
        float f8 = 0.0f;
        LazyStaggeredGridState lazyStaggeredGridState4 = this.f5080a;
        if ((f7 >= 0.0f || lazyStaggeredGridState4.d()) && (f7 <= 0.0f || lazyStaggeredGridState4.c())) {
            if (Math.abs(lazyStaggeredGridState4.f5059m) > 0.5f) {
                throw new IllegalStateException(("entered drag with non-zero pending scroll: " + lazyStaggeredGridState4.f5059m).toString());
            }
            float f9 = lazyStaggeredGridState4.f5059m + f7;
            lazyStaggeredGridState4.f5059m = f9;
            if (Math.abs(f9) > 0.5f) {
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = lazyStaggeredGridState4.f5050b;
                LazyStaggeredGridMeasureResult lazyStaggeredGridMeasureResult = (LazyStaggeredGridMeasureResult) parcelableSnapshotMutableState.getValue();
                float f10 = lazyStaggeredGridState4.f5059m;
                int t02 = a.t0(f10);
                if (!lazyStaggeredGridMeasureResult.f5003f) {
                    List list = lazyStaggeredGridMeasureResult.f5008k;
                    if (!list.isEmpty() && lazyStaggeredGridMeasureResult.f5000a.length != 0 && lazyStaggeredGridMeasureResult.f5001b.length != 0) {
                        int i4 = lazyStaggeredGridMeasureResult.f5013p;
                        int i5 = lazyStaggeredGridMeasureResult.f5011n;
                        int i6 = i5 - i4;
                        int size = list.size();
                        int i7 = 0;
                        while (true) {
                            if (i7 < size) {
                                LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem = (LazyStaggeredGridMeasuredItem) list.get(i7);
                                if (lazyStaggeredGridMeasuredItem.f5033r) {
                                    break;
                                }
                                if ((lazyStaggeredGridMeasuredItem.f() <= 0) != (lazyStaggeredGridMeasuredItem.f() + t02 <= 0)) {
                                    break;
                                }
                                int f11 = lazyStaggeredGridMeasuredItem.f();
                                int i8 = lazyStaggeredGridMeasureResult.f5010m;
                                int i9 = lazyStaggeredGridMeasuredItem.f5029n;
                                if (f11 <= i8) {
                                    if (t02 < 0) {
                                        if ((lazyStaggeredGridMeasuredItem.f() + i9) - i8 <= (-t02)) {
                                            break;
                                        }
                                    } else if (i8 - lazyStaggeredGridMeasuredItem.f() <= t02) {
                                        break;
                                    }
                                }
                                if (lazyStaggeredGridMeasuredItem.f() + i9 >= i6) {
                                    if (t02 < 0) {
                                        if ((lazyStaggeredGridMeasuredItem.f() + i9) - i5 <= (-t02)) {
                                            break;
                                        }
                                    } else {
                                        if (i5 - lazyStaggeredGridMeasuredItem.f() <= t02) {
                                            break;
                                        }
                                    }
                                }
                                i7++;
                            } else {
                                int length = lazyStaggeredGridMeasureResult.f5001b.length;
                                int[] iArr = new int[length];
                                for (int i10 = 0; i10 < length; i10++) {
                                    iArr[i10] = lazyStaggeredGridMeasureResult.f5001b[i10] - t02;
                                }
                                lazyStaggeredGridMeasureResult.f5001b = iArr;
                                int size2 = list.size();
                                int i11 = 0;
                                while (i11 < size2) {
                                    LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem2 = (LazyStaggeredGridMeasuredItem) list.get(i11);
                                    if (lazyStaggeredGridMeasuredItem2.f5033r) {
                                        f5 = f7;
                                        i2 = size2;
                                        lazyStaggeredGridState2 = lazyStaggeredGridState4;
                                    } else {
                                        long j2 = lazyStaggeredGridMeasuredItem2.f5034s;
                                        boolean z2 = lazyStaggeredGridMeasuredItem2.d;
                                        char c3 = ' ';
                                        if (z2) {
                                            f4 = f7;
                                            i2 = size2;
                                            i3 = (int) (j2 >> 32);
                                        } else {
                                            f4 = f7;
                                            i2 = size2;
                                            i3 = ((int) (j2 >> 32)) + t02;
                                        }
                                        lazyStaggeredGridMeasuredItem2.f5034s = IntOffsetKt.a(i3, z2 ? ((int) (j2 & 4294967295L)) + t02 : (int) (j2 & 4294967295L));
                                        int size3 = lazyStaggeredGridMeasuredItem2.f5020c.size();
                                        int i12 = 0;
                                        while (i12 < size3) {
                                            LazyLayoutItemAnimation a2 = lazyStaggeredGridMeasuredItem2.f5025j.a(i12, lazyStaggeredGridMeasuredItem2.f5019b);
                                            if (a2 != null) {
                                                f6 = f4;
                                                long j3 = a2.f4718l;
                                                if (z2) {
                                                    lazyStaggeredGridState3 = lazyStaggeredGridState4;
                                                    c2 = ' ';
                                                    intValue = (int) (j3 >> 32);
                                                } else {
                                                    lazyStaggeredGridState3 = lazyStaggeredGridState4;
                                                    c2 = ' ';
                                                    intValue = Integer.valueOf(((int) (j3 >> 32)) + t02).intValue();
                                                }
                                                a2.f4718l = IntOffsetKt.a(intValue, z2 ? ((int) (j3 & 4294967295L)) + t02 : (int) (j3 & 4294967295L));
                                            } else {
                                                lazyStaggeredGridState3 = lazyStaggeredGridState4;
                                                c2 = c3;
                                                f6 = f4;
                                            }
                                            i12++;
                                            c3 = c2;
                                            f4 = f6;
                                            lazyStaggeredGridState4 = lazyStaggeredGridState3;
                                        }
                                        lazyStaggeredGridState2 = lazyStaggeredGridState4;
                                        f5 = f4;
                                    }
                                    i11++;
                                    size2 = i2;
                                    f7 = f5;
                                    lazyStaggeredGridState4 = lazyStaggeredGridState2;
                                }
                                f2 = f7;
                                LazyStaggeredGridState lazyStaggeredGridState5 = lazyStaggeredGridState4;
                                lazyStaggeredGridMeasureResult.f5002c = t02;
                                if (!lazyStaggeredGridMeasureResult.e && t02 > 0) {
                                    lazyStaggeredGridMeasureResult.e = true;
                                }
                                lazyStaggeredGridState = lazyStaggeredGridState5;
                                lazyStaggeredGridState.f(lazyStaggeredGridMeasureResult, true);
                                ObservableScopeInvalidator.b(lazyStaggeredGridState.f5065s);
                                lazyStaggeredGridState.h(f10 - lazyStaggeredGridState.f5059m, lazyStaggeredGridMeasureResult);
                            }
                        }
                    }
                }
                f2 = f7;
                lazyStaggeredGridState = lazyStaggeredGridState4;
                Remeasurement remeasurement = lazyStaggeredGridState.f5052f;
                if (remeasurement != null) {
                    remeasurement.d();
                }
                lazyStaggeredGridState.h(f10 - lazyStaggeredGridState.f5059m, (LazyStaggeredGridMeasureResult) parcelableSnapshotMutableState.getValue());
            } else {
                f2 = f7;
                lazyStaggeredGridState = lazyStaggeredGridState4;
            }
            if (Math.abs(lazyStaggeredGridState.f5059m) <= 0.5f) {
                f3 = f2;
                return Float.valueOf(-f3);
            }
            f8 = f2 - lazyStaggeredGridState.f5059m;
            lazyStaggeredGridState.f5059m = 0.0f;
        }
        f3 = f8;
        return Float.valueOf(-f3);
    }
}
