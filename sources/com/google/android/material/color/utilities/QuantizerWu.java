package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@RestrictTo
/* loaded from: classes.dex */
public final class QuantizerWu implements Quantizer {
    private static final int INDEX_BITS = 5;
    private static final int INDEX_COUNT = 33;
    private static final int TOTAL_SIZE = 35937;
    Box[] cubes;
    double[] moments;
    int[] momentsB;
    int[] momentsG;
    int[] momentsR;
    int[] weights;

    /* renamed from: com.google.android.material.color.utilities.QuantizerWu$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$android$material$color$utilities$QuantizerWu$Direction;

        static {
            int[] iArr = new int[Direction.values().length];
            $SwitchMap$com$google$android$material$color$utilities$QuantizerWu$Direction = iArr;
            try {
                iArr[Direction.RED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$android$material$color$utilities$QuantizerWu$Direction[Direction.GREEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$android$material$color$utilities$QuantizerWu$Direction[Direction.BLUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class Box {

        /* renamed from: b0, reason: collision with root package name */
        int f28669b0;

        /* renamed from: b1, reason: collision with root package name */
        int f28670b1;

        /* renamed from: g0, reason: collision with root package name */
        int f28671g0;

        /* renamed from: g1, reason: collision with root package name */
        int f28672g1;

        /* renamed from: r0, reason: collision with root package name */
        int f28673r0;
        int r1;
        int vol;

        private Box() {
            this.f28673r0 = 0;
            this.r1 = 0;
            this.f28671g0 = 0;
            this.f28672g1 = 0;
            this.f28669b0 = 0;
            this.f28670b1 = 0;
            this.vol = 0;
        }

        public /* synthetic */ Box(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public static final class CreateBoxesResult {
        int resultCount;

        public CreateBoxesResult(int i2, int i3) {
            this.resultCount = i3;
        }
    }

    /* loaded from: classes.dex */
    public enum Direction {
        RED,
        GREEN,
        BLUE
    }

    /* loaded from: classes.dex */
    public static final class MaximizeResult {
        int cutLocation;
        double maximum;

        public MaximizeResult(int i2, double d) {
            this.cutLocation = i2;
            this.maximum = d;
        }
    }

    public static int bottom(Box box, Direction direction, int[] iArr) {
        int i2;
        int i3;
        int i4 = AnonymousClass1.$SwitchMap$com$google$android$material$color$utilities$QuantizerWu$Direction[direction.ordinal()];
        if (i4 == 1) {
            i2 = (-iArr[getIndex(box.f28673r0, box.f28672g1, box.f28670b1)]) + iArr[getIndex(box.f28673r0, box.f28672g1, box.f28669b0)] + iArr[getIndex(box.f28673r0, box.f28671g0, box.f28670b1)];
            i3 = iArr[getIndex(box.f28673r0, box.f28671g0, box.f28669b0)];
        } else if (i4 == 2) {
            i2 = (-iArr[getIndex(box.r1, box.f28671g0, box.f28670b1)]) + iArr[getIndex(box.r1, box.f28671g0, box.f28669b0)] + iArr[getIndex(box.f28673r0, box.f28671g0, box.f28670b1)];
            i3 = iArr[getIndex(box.f28673r0, box.f28671g0, box.f28669b0)];
        } else {
            if (i4 != 3) {
                throw new IllegalArgumentException("unexpected direction " + direction);
            }
            i2 = (-iArr[getIndex(box.r1, box.f28672g1, box.f28669b0)]) + iArr[getIndex(box.r1, box.f28671g0, box.f28669b0)] + iArr[getIndex(box.f28673r0, box.f28672g1, box.f28669b0)];
            i3 = iArr[getIndex(box.f28673r0, box.f28671g0, box.f28669b0)];
        }
        return i2 - i3;
    }

    public static int getIndex(int i2, int i3, int i4) {
        return (i2 << 10) + (i2 << 6) + i2 + (i3 << 5) + i3 + i4;
    }

    public static int top(Box box, Direction direction, int i2, int[] iArr) {
        int i3;
        int i4;
        int i5 = AnonymousClass1.$SwitchMap$com$google$android$material$color$utilities$QuantizerWu$Direction[direction.ordinal()];
        if (i5 == 1) {
            i3 = (iArr[getIndex(i2, box.f28672g1, box.f28670b1)] - iArr[getIndex(i2, box.f28672g1, box.f28669b0)]) - iArr[getIndex(i2, box.f28671g0, box.f28670b1)];
            i4 = iArr[getIndex(i2, box.f28671g0, box.f28669b0)];
        } else if (i5 == 2) {
            i3 = (iArr[getIndex(box.r1, i2, box.f28670b1)] - iArr[getIndex(box.r1, i2, box.f28669b0)]) - iArr[getIndex(box.f28673r0, i2, box.f28670b1)];
            i4 = iArr[getIndex(box.f28673r0, i2, box.f28669b0)];
        } else {
            if (i5 != 3) {
                throw new IllegalArgumentException("unexpected direction " + direction);
            }
            i3 = (iArr[getIndex(box.r1, box.f28672g1, i2)] - iArr[getIndex(box.r1, box.f28671g0, i2)]) - iArr[getIndex(box.f28673r0, box.f28672g1, i2)];
            i4 = iArr[getIndex(box.f28673r0, box.f28671g0, i2)];
        }
        return i3 + i4;
    }

    public static int volume(Box box, int[] iArr) {
        return ((((((iArr[getIndex(box.r1, box.f28672g1, box.f28670b1)] - iArr[getIndex(box.r1, box.f28672g1, box.f28669b0)]) - iArr[getIndex(box.r1, box.f28671g0, box.f28670b1)]) + iArr[getIndex(box.r1, box.f28671g0, box.f28669b0)]) - iArr[getIndex(box.f28673r0, box.f28672g1, box.f28670b1)]) + iArr[getIndex(box.f28673r0, box.f28672g1, box.f28669b0)]) + iArr[getIndex(box.f28673r0, box.f28671g0, box.f28670b1)]) - iArr[getIndex(box.f28673r0, box.f28671g0, box.f28669b0)];
    }

    public void constructHistogram(Map<Integer, Integer> map) {
        this.weights = new int[TOTAL_SIZE];
        this.momentsR = new int[TOTAL_SIZE];
        this.momentsG = new int[TOTAL_SIZE];
        this.momentsB = new int[TOTAL_SIZE];
        this.moments = new double[TOTAL_SIZE];
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int intValue = entry.getKey().intValue();
            int intValue2 = entry.getValue().intValue();
            int redFromArgb = ColorUtils.redFromArgb(intValue);
            int greenFromArgb = ColorUtils.greenFromArgb(intValue);
            int blueFromArgb = ColorUtils.blueFromArgb(intValue);
            int index = getIndex((redFromArgb >> 3) + 1, (greenFromArgb >> 3) + 1, (blueFromArgb >> 3) + 1);
            int[] iArr = this.weights;
            iArr[index] = iArr[index] + intValue2;
            int[] iArr2 = this.momentsR;
            iArr2[index] = (redFromArgb * intValue2) + iArr2[index];
            int[] iArr3 = this.momentsG;
            iArr3[index] = (greenFromArgb * intValue2) + iArr3[index];
            int[] iArr4 = this.momentsB;
            iArr4[index] = (blueFromArgb * intValue2) + iArr4[index];
            double[] dArr = this.moments;
            int i2 = blueFromArgb * blueFromArgb;
            dArr[index] = dArr[index] + ((i2 + (greenFromArgb * greenFromArgb) + (redFromArgb * redFromArgb)) * intValue2);
        }
    }

    public CreateBoxesResult createBoxes(int i2) {
        int i3;
        this.cubes = new Box[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            this.cubes[i4] = new Box(null);
        }
        double[] dArr = new double[i2];
        Box box = this.cubes[0];
        box.r1 = 32;
        box.f28672g1 = 32;
        box.f28670b1 = 32;
        int i5 = 0;
        int i6 = 1;
        while (true) {
            if (i6 >= i2) {
                i3 = i2;
                break;
            }
            Box[] boxArr = this.cubes;
            if (cut(boxArr[i5], boxArr[i6]).booleanValue()) {
                Box box2 = this.cubes[i5];
                dArr[i5] = box2.vol > 1 ? variance(box2) : 0.0d;
                Box box3 = this.cubes[i6];
                dArr[i6] = box3.vol > 1 ? variance(box3) : 0.0d;
            } else {
                dArr[i5] = 0.0d;
                i6--;
            }
            double d = dArr[0];
            int i7 = 0;
            for (int i8 = 1; i8 <= i6; i8++) {
                double d2 = dArr[i8];
                if (d2 > d) {
                    i7 = i8;
                    d = d2;
                }
            }
            if (d <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                i3 = i6 + 1;
                break;
            }
            i6++;
            i5 = i7;
        }
        return new CreateBoxesResult(i2, i3);
    }

    public void createMoments() {
        int i2 = 1;
        while (true) {
            int i3 = 33;
            if (i2 >= 33) {
                return;
            }
            int[] iArr = new int[33];
            int[] iArr2 = new int[33];
            int[] iArr3 = new int[33];
            int[] iArr4 = new int[33];
            double[] dArr = new double[33];
            int i4 = 1;
            while (i4 < i3) {
                int i5 = 0;
                int i6 = 0;
                double d = 0.0d;
                int i7 = 1;
                int i8 = 0;
                int i9 = 0;
                while (i7 < i3) {
                    int index = getIndex(i2, i4, i7);
                    int i10 = i5 + this.weights[index];
                    i8 += this.momentsR[index];
                    i9 += this.momentsG[index];
                    i6 += this.momentsB[index];
                    d += this.moments[index];
                    iArr[i7] = iArr[i7] + i10;
                    iArr2[i7] = iArr2[i7] + i8;
                    iArr3[i7] = iArr3[i7] + i9;
                    iArr4[i7] = iArr4[i7] + i6;
                    dArr[i7] = dArr[i7] + d;
                    int index2 = getIndex(i2 - 1, i4, i7);
                    int[] iArr5 = this.weights;
                    iArr5[index] = iArr5[index2] + iArr[i7];
                    int[] iArr6 = this.momentsR;
                    iArr6[index] = iArr6[index2] + iArr2[i7];
                    int[] iArr7 = this.momentsG;
                    iArr7[index] = iArr7[index2] + iArr3[i7];
                    int[] iArr8 = this.momentsB;
                    iArr8[index] = iArr8[index2] + iArr4[i7];
                    double[] dArr2 = this.moments;
                    dArr2[index] = dArr2[index2] + dArr[i7];
                    i7++;
                    i5 = i10;
                    i3 = 33;
                }
                i4++;
                i3 = 33;
            }
            i2++;
        }
    }

    public List<Integer> createResult(int i2) {
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < i2; i3++) {
            Box box = this.cubes[i3];
            int volume = volume(box, this.weights);
            if (volume > 0) {
                int volume2 = volume(box, this.momentsR) / volume;
                int volume3 = volume(box, this.momentsG) / volume;
                arrayList.add(Integer.valueOf(((volume(box, this.momentsB) / volume) & 255) | ((volume2 & 255) << 16) | (-16777216) | ((volume3 & 255) << 8)));
            }
        }
        return arrayList;
    }

    public Boolean cut(Box box, Box box2) {
        int volume = volume(box, this.momentsR);
        int volume2 = volume(box, this.momentsG);
        int volume3 = volume(box, this.momentsB);
        int volume4 = volume(box, this.weights);
        Direction direction = Direction.RED;
        MaximizeResult maximize = maximize(box, direction, box.f28673r0 + 1, box.r1, volume, volume2, volume3, volume4);
        Direction direction2 = Direction.GREEN;
        MaximizeResult maximize2 = maximize(box, direction2, box.f28671g0 + 1, box.f28672g1, volume, volume2, volume3, volume4);
        Direction direction3 = Direction.BLUE;
        MaximizeResult maximize3 = maximize(box, direction3, box.f28669b0 + 1, box.f28670b1, volume, volume2, volume3, volume4);
        double d = maximize.maximum;
        double d2 = maximize2.maximum;
        double d3 = maximize3.maximum;
        if (d < d2 || d < d3) {
            direction = (d2 < d || d2 < d3) ? direction3 : direction2;
        } else if (maximize.cutLocation < 0) {
            return Boolean.FALSE;
        }
        box2.r1 = box.r1;
        box2.f28672g1 = box.f28672g1;
        box2.f28670b1 = box.f28670b1;
        int i2 = AnonymousClass1.$SwitchMap$com$google$android$material$color$utilities$QuantizerWu$Direction[direction.ordinal()];
        if (i2 == 1) {
            int i3 = maximize.cutLocation;
            box.r1 = i3;
            box2.f28673r0 = i3;
            box2.f28671g0 = box.f28671g0;
            box2.f28669b0 = box.f28669b0;
        } else if (i2 == 2) {
            int i4 = maximize2.cutLocation;
            box.f28672g1 = i4;
            box2.f28673r0 = box.f28673r0;
            box2.f28671g0 = i4;
            box2.f28669b0 = box.f28669b0;
        } else if (i2 == 3) {
            int i5 = maximize3.cutLocation;
            box.f28670b1 = i5;
            box2.f28673r0 = box.f28673r0;
            box2.f28671g0 = box.f28671g0;
            box2.f28669b0 = i5;
        }
        box.vol = (box.f28670b1 - box.f28669b0) * (box.f28672g1 - box.f28671g0) * (box.r1 - box.f28673r0);
        box2.vol = (box2.f28670b1 - box2.f28669b0) * (box2.f28672g1 - box2.f28671g0) * (box2.r1 - box2.f28673r0);
        return Boolean.TRUE;
    }

    public MaximizeResult maximize(Box box, Direction direction, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8;
        QuantizerWu quantizerWu = this;
        Box box2 = box;
        Direction direction2 = direction;
        int bottom = bottom(box2, direction2, quantizerWu.momentsR);
        int bottom2 = bottom(box2, direction2, quantizerWu.momentsG);
        int bottom3 = bottom(box2, direction2, quantizerWu.momentsB);
        int bottom4 = bottom(box2, direction2, quantizerWu.weights);
        int i9 = -1;
        double d = 0.0d;
        int i10 = i2;
        while (i10 < i3) {
            int pVar = top(box2, direction2, i10, quantizerWu.momentsR) + bottom;
            int pVar2 = top(box2, direction2, i10, quantizerWu.momentsG) + bottom2;
            int pVar3 = top(box2, direction2, i10, quantizerWu.momentsB) + bottom3;
            int pVar4 = top(box2, direction2, i10, quantizerWu.weights) + bottom4;
            if (pVar4 == 0) {
                i8 = bottom;
            } else {
                i8 = bottom;
                double d2 = ((pVar3 * pVar3) + ((pVar2 * pVar2) + (pVar * pVar))) / pVar4;
                int i11 = i4 - pVar;
                int i12 = i5 - pVar2;
                int i13 = i6 - pVar3;
                int i14 = i7 - pVar4;
                if (i14 != 0) {
                    int i15 = i13 * i13;
                    double d3 = ((i15 + ((i12 * i12) + (i11 * i11))) / i14) + d2;
                    if (d3 > d) {
                        d = d3;
                        i9 = i10;
                    }
                }
            }
            i10++;
            quantizerWu = this;
            box2 = box;
            direction2 = direction;
            bottom = i8;
        }
        return new MaximizeResult(i9, d);
    }

    @Override // com.google.android.material.color.utilities.Quantizer
    public QuantizerResult quantize(int[] iArr, int i2) {
        constructHistogram(new QuantizerMap().quantize(iArr, i2).colorToCount);
        createMoments();
        List<Integer> createResult = createResult(createBoxes(i2).resultCount);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Integer> it = createResult.iterator();
        while (it.hasNext()) {
            linkedHashMap.put(Integer.valueOf(it.next().intValue()), 0);
        }
        return new QuantizerResult(linkedHashMap);
    }

    public double variance(Box box) {
        int volume = volume(box, this.momentsR);
        int volume2 = volume(box, this.momentsG);
        int volume3 = volume(box, this.momentsB);
        int i2 = volume3 * volume3;
        return (((((((this.moments[getIndex(box.r1, box.f28672g1, box.f28670b1)] - this.moments[getIndex(box.r1, box.f28672g1, box.f28669b0)]) - this.moments[getIndex(box.r1, box.f28671g0, box.f28670b1)]) + this.moments[getIndex(box.r1, box.f28671g0, box.f28669b0)]) - this.moments[getIndex(box.f28673r0, box.f28672g1, box.f28670b1)]) + this.moments[getIndex(box.f28673r0, box.f28672g1, box.f28669b0)]) + this.moments[getIndex(box.f28673r0, box.f28671g0, box.f28670b1)]) - this.moments[getIndex(box.f28673r0, box.f28671g0, box.f28669b0)]) - ((i2 + ((volume2 * volume2) + (volume * volume))) / volume(box, this.weights));
    }
}
