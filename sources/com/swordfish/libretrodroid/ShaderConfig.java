package com.swordfish.libretrodroid;

import android.support.v4.media.d;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.objectweb.asm.Opcodes;

/* loaded from: classes2.dex */
public interface ShaderConfig {

    /* loaded from: classes2.dex */
    public static final class CRT implements ShaderConfig {

        @NotNull
        public static final CRT INSTANCE = new CRT();

        private CRT() {
        }
    }

    /* loaded from: classes2.dex */
    public static final class CUT implements ShaderConfig {
        private final float blendMaxContrastEdge;
        private final float blendMaxSharpness;
        private final float blendMinContrastEdge;
        private final float blendMinSharpness;
        private final float edgeMinContrast;
        private final float edgeMinValue;
        private final boolean edgeUseFastLuma;
        private final float staticSharpness;
        private final boolean useDynamicBlend;

        public CUT() {
            this(false, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, 511, null);
        }

        public final boolean component1() {
            return this.useDynamicBlend;
        }

        public final float component2() {
            return this.blendMinContrastEdge;
        }

        public final float component3() {
            return this.blendMaxContrastEdge;
        }

        public final float component4() {
            return this.blendMinSharpness;
        }

        public final float component5() {
            return this.blendMaxSharpness;
        }

        public final float component6() {
            return this.staticSharpness;
        }

        public final boolean component7() {
            return this.edgeUseFastLuma;
        }

        public final float component8() {
            return this.edgeMinValue;
        }

        public final float component9() {
            return this.edgeMinContrast;
        }

        @NotNull
        public final CUT copy(boolean z2, float f2, float f3, float f4, float f5, float f6, boolean z3, float f7, float f8) {
            return new CUT(z2, f2, f3, f4, f5, f6, z3, f7, f8);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CUT)) {
                return false;
            }
            CUT cut = (CUT) obj;
            return this.useDynamicBlend == cut.useDynamicBlend && p0.a.g(Float.valueOf(this.blendMinContrastEdge), Float.valueOf(cut.blendMinContrastEdge)) && p0.a.g(Float.valueOf(this.blendMaxContrastEdge), Float.valueOf(cut.blendMaxContrastEdge)) && p0.a.g(Float.valueOf(this.blendMinSharpness), Float.valueOf(cut.blendMinSharpness)) && p0.a.g(Float.valueOf(this.blendMaxSharpness), Float.valueOf(cut.blendMaxSharpness)) && p0.a.g(Float.valueOf(this.staticSharpness), Float.valueOf(cut.staticSharpness)) && this.edgeUseFastLuma == cut.edgeUseFastLuma && p0.a.g(Float.valueOf(this.edgeMinValue), Float.valueOf(cut.edgeMinValue)) && p0.a.g(Float.valueOf(this.edgeMinContrast), Float.valueOf(cut.edgeMinContrast));
        }

        public final float getBlendMaxContrastEdge() {
            return this.blendMaxContrastEdge;
        }

        public final float getBlendMaxSharpness() {
            return this.blendMaxSharpness;
        }

        public final float getBlendMinContrastEdge() {
            return this.blendMinContrastEdge;
        }

        public final float getBlendMinSharpness() {
            return this.blendMinSharpness;
        }

        public final float getEdgeMinContrast() {
            return this.edgeMinContrast;
        }

        public final float getEdgeMinValue() {
            return this.edgeMinValue;
        }

        public final boolean getEdgeUseFastLuma() {
            return this.edgeUseFastLuma;
        }

        public final float getStaticSharpness() {
            return this.staticSharpness;
        }

        public final boolean getUseDynamicBlend() {
            return this.useDynamicBlend;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v11 */
        /* JADX WARN: Type inference failed for: r0v12 */
        public int hashCode() {
            boolean z2 = this.useDynamicBlend;
            ?? r02 = z2;
            if (z2) {
                r02 = 1;
            }
            int b2 = d.b(this.staticSharpness, d.b(this.blendMaxSharpness, d.b(this.blendMinSharpness, d.b(this.blendMaxContrastEdge, d.b(this.blendMinContrastEdge, r02 * 31, 31), 31), 31), 31), 31);
            boolean z3 = this.edgeUseFastLuma;
            return Float.hashCode(this.edgeMinContrast) + d.b(this.edgeMinValue, (b2 + (z3 ? 1 : z3 ? 1 : 0)) * 31, 31);
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder("CUT(useDynamicBlend=");
            sb.append(this.useDynamicBlend);
            sb.append(", blendMinContrastEdge=");
            sb.append(this.blendMinContrastEdge);
            sb.append(", blendMaxContrastEdge=");
            sb.append(this.blendMaxContrastEdge);
            sb.append(", blendMinSharpness=");
            sb.append(this.blendMinSharpness);
            sb.append(", blendMaxSharpness=");
            sb.append(this.blendMaxSharpness);
            sb.append(", staticSharpness=");
            sb.append(this.staticSharpness);
            sb.append(", edgeUseFastLuma=");
            sb.append(this.edgeUseFastLuma);
            sb.append(", edgeMinValue=");
            sb.append(this.edgeMinValue);
            sb.append(", edgeMinContrast=");
            return d.n(sb, this.edgeMinContrast, ')');
        }

        public CUT(boolean z2, float f2, float f3, float f4, float f5, float f6, boolean z3, float f7, float f8) {
            this.useDynamicBlend = z2;
            this.blendMinContrastEdge = f2;
            this.blendMaxContrastEdge = f3;
            this.blendMinSharpness = f4;
            this.blendMaxSharpness = f5;
            this.staticSharpness = f6;
            this.edgeUseFastLuma = z3;
            this.edgeMinValue = f7;
            this.edgeMinContrast = f8;
        }

        public /* synthetic */ CUT(boolean z2, float f2, float f3, float f4, float f5, float f6, boolean z3, float f7, float f8, int i2, k kVar) {
            this((i2 & 1) != 0 ? true : z2, (i2 & 2) != 0 ? 0.0f : f2, (i2 & 4) != 0 ? 1.0f : f3, (i2 & 8) == 0 ? f4 : 0.0f, (i2 & 16) == 0 ? f5 : 1.0f, (i2 & 32) != 0 ? 0.5f : f6, (i2 & 64) == 0 ? z3 : true, (i2 & 128) != 0 ? 0.05f : f7, (i2 & 256) != 0 ? 2.0f : f8);
        }
    }

    /* loaded from: classes2.dex */
    public static final class CUT2 implements ShaderConfig {
        private final float blendMaxContrastEdge;
        private final float blendMaxSharpness;
        private final float blendMinContrastEdge;
        private final float blendMinSharpness;
        private final float edgeMinValue;
        private final boolean edgeUseFastLuma;
        private final boolean softEdgesSharpening;
        private final float softEdgesSharpeningAmount;
        private final float staticSharpness;
        private final boolean useDynamicBlend;

        public CUT2() {
            this(false, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, false, 0.0f, 1023, null);
        }

        public final boolean component1() {
            return this.useDynamicBlend;
        }

        public final float component10() {
            return this.softEdgesSharpeningAmount;
        }

        public final float component2() {
            return this.blendMinContrastEdge;
        }

        public final float component3() {
            return this.blendMaxContrastEdge;
        }

        public final float component4() {
            return this.blendMinSharpness;
        }

        public final float component5() {
            return this.blendMaxSharpness;
        }

        public final float component6() {
            return this.staticSharpness;
        }

        public final boolean component7() {
            return this.edgeUseFastLuma;
        }

        public final float component8() {
            return this.edgeMinValue;
        }

        public final boolean component9() {
            return this.softEdgesSharpening;
        }

        @NotNull
        public final CUT2 copy(boolean z2, float f2, float f3, float f4, float f5, float f6, boolean z3, float f7, boolean z4, float f8) {
            return new CUT2(z2, f2, f3, f4, f5, f6, z3, f7, z4, f8);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CUT2)) {
                return false;
            }
            CUT2 cut2 = (CUT2) obj;
            return this.useDynamicBlend == cut2.useDynamicBlend && p0.a.g(Float.valueOf(this.blendMinContrastEdge), Float.valueOf(cut2.blendMinContrastEdge)) && p0.a.g(Float.valueOf(this.blendMaxContrastEdge), Float.valueOf(cut2.blendMaxContrastEdge)) && p0.a.g(Float.valueOf(this.blendMinSharpness), Float.valueOf(cut2.blendMinSharpness)) && p0.a.g(Float.valueOf(this.blendMaxSharpness), Float.valueOf(cut2.blendMaxSharpness)) && p0.a.g(Float.valueOf(this.staticSharpness), Float.valueOf(cut2.staticSharpness)) && this.edgeUseFastLuma == cut2.edgeUseFastLuma && p0.a.g(Float.valueOf(this.edgeMinValue), Float.valueOf(cut2.edgeMinValue)) && this.softEdgesSharpening == cut2.softEdgesSharpening && p0.a.g(Float.valueOf(this.softEdgesSharpeningAmount), Float.valueOf(cut2.softEdgesSharpeningAmount));
        }

        public final float getBlendMaxContrastEdge() {
            return this.blendMaxContrastEdge;
        }

        public final float getBlendMaxSharpness() {
            return this.blendMaxSharpness;
        }

        public final float getBlendMinContrastEdge() {
            return this.blendMinContrastEdge;
        }

        public final float getBlendMinSharpness() {
            return this.blendMinSharpness;
        }

        public final float getEdgeMinValue() {
            return this.edgeMinValue;
        }

        public final boolean getEdgeUseFastLuma() {
            return this.edgeUseFastLuma;
        }

        public final boolean getSoftEdgesSharpening() {
            return this.softEdgesSharpening;
        }

        public final float getSoftEdgesSharpeningAmount() {
            return this.softEdgesSharpeningAmount;
        }

        public final float getStaticSharpness() {
            return this.staticSharpness;
        }

        public final boolean getUseDynamicBlend() {
            return this.useDynamicBlend;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v13 */
        /* JADX WARN: Type inference failed for: r0v14 */
        /* JADX WARN: Type inference failed for: r3v5, types: [boolean] */
        public int hashCode() {
            boolean z2 = this.useDynamicBlend;
            ?? r02 = z2;
            if (z2) {
                r02 = 1;
            }
            int b2 = d.b(this.staticSharpness, d.b(this.blendMaxSharpness, d.b(this.blendMinSharpness, d.b(this.blendMaxContrastEdge, d.b(this.blendMinContrastEdge, r02 * 31, 31), 31), 31), 31), 31);
            ?? r3 = this.edgeUseFastLuma;
            int i2 = r3;
            if (r3 != 0) {
                i2 = 1;
            }
            int b3 = d.b(this.edgeMinValue, (b2 + i2) * 31, 31);
            boolean z3 = this.softEdgesSharpening;
            return Float.hashCode(this.softEdgesSharpeningAmount) + ((b3 + (z3 ? 1 : z3 ? 1 : 0)) * 31);
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder("CUT2(useDynamicBlend=");
            sb.append(this.useDynamicBlend);
            sb.append(", blendMinContrastEdge=");
            sb.append(this.blendMinContrastEdge);
            sb.append(", blendMaxContrastEdge=");
            sb.append(this.blendMaxContrastEdge);
            sb.append(", blendMinSharpness=");
            sb.append(this.blendMinSharpness);
            sb.append(", blendMaxSharpness=");
            sb.append(this.blendMaxSharpness);
            sb.append(", staticSharpness=");
            sb.append(this.staticSharpness);
            sb.append(", edgeUseFastLuma=");
            sb.append(this.edgeUseFastLuma);
            sb.append(", edgeMinValue=");
            sb.append(this.edgeMinValue);
            sb.append(", softEdgesSharpening=");
            sb.append(this.softEdgesSharpening);
            sb.append(", softEdgesSharpeningAmount=");
            return d.n(sb, this.softEdgesSharpeningAmount, ')');
        }

        public CUT2(boolean z2, float f2, float f3, float f4, float f5, float f6, boolean z3, float f7, boolean z4, float f8) {
            this.useDynamicBlend = z2;
            this.blendMinContrastEdge = f2;
            this.blendMaxContrastEdge = f3;
            this.blendMinSharpness = f4;
            this.blendMaxSharpness = f5;
            this.staticSharpness = f6;
            this.edgeUseFastLuma = z3;
            this.edgeMinValue = f7;
            this.softEdgesSharpening = z4;
            this.softEdgesSharpeningAmount = f8;
        }

        public /* synthetic */ CUT2(boolean z2, float f2, float f3, float f4, float f5, float f6, boolean z3, float f7, boolean z4, float f8, int i2, k kVar) {
            this((i2 & 1) != 0 ? true : z2, (i2 & 2) != 0 ? 0.0f : f2, (i2 & 4) != 0 ? 0.5f : f3, (i2 & 8) == 0 ? f4 : 0.0f, (i2 & 16) != 0 ? 0.75f : f5, (i2 & 32) == 0 ? f6 : 0.75f, (i2 & 64) != 0 ? false : z3, (i2 & 128) != 0 ? 0.025f : f7, (i2 & 256) == 0 ? z4 : true, (i2 & 512) != 0 ? 1.0f : f8);
        }
    }

    /* loaded from: classes2.dex */
    public static final class CUT3 implements ShaderConfig {
        private final float blendMaxContrastEdge;
        private final float blendMaxSharpness;
        private final float blendMinContrastEdge;
        private final float blendMinSharpness;
        private final float edgeMinValue;
        private final boolean edgeUseFastLuma;
        private final int searchMaxDistance;
        private final float searchMinContrast;
        private final boolean softEdgesSharpening;
        private final float softEdgesSharpeningAmount;
        private final float staticSharpness;
        private final boolean useDynamicBlend;

        public CUT3() {
            this(false, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, false, 0.0f, 0.0f, 0, 4095, null);
        }

        public final boolean component1() {
            return this.useDynamicBlend;
        }

        public final float component10() {
            return this.softEdgesSharpeningAmount;
        }

        public final float component11() {
            return this.searchMinContrast;
        }

        public final int component12() {
            return this.searchMaxDistance;
        }

        public final float component2() {
            return this.blendMinContrastEdge;
        }

        public final float component3() {
            return this.blendMaxContrastEdge;
        }

        public final float component4() {
            return this.blendMinSharpness;
        }

        public final float component5() {
            return this.blendMaxSharpness;
        }

        public final float component6() {
            return this.staticSharpness;
        }

        public final boolean component7() {
            return this.edgeUseFastLuma;
        }

        public final float component8() {
            return this.edgeMinValue;
        }

        public final boolean component9() {
            return this.softEdgesSharpening;
        }

        @NotNull
        public final CUT3 copy(boolean z2, float f2, float f3, float f4, float f5, float f6, boolean z3, float f7, boolean z4, float f8, float f9, int i2) {
            return new CUT3(z2, f2, f3, f4, f5, f6, z3, f7, z4, f8, f9, i2);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CUT3)) {
                return false;
            }
            CUT3 cut3 = (CUT3) obj;
            return this.useDynamicBlend == cut3.useDynamicBlend && p0.a.g(Float.valueOf(this.blendMinContrastEdge), Float.valueOf(cut3.blendMinContrastEdge)) && p0.a.g(Float.valueOf(this.blendMaxContrastEdge), Float.valueOf(cut3.blendMaxContrastEdge)) && p0.a.g(Float.valueOf(this.blendMinSharpness), Float.valueOf(cut3.blendMinSharpness)) && p0.a.g(Float.valueOf(this.blendMaxSharpness), Float.valueOf(cut3.blendMaxSharpness)) && p0.a.g(Float.valueOf(this.staticSharpness), Float.valueOf(cut3.staticSharpness)) && this.edgeUseFastLuma == cut3.edgeUseFastLuma && p0.a.g(Float.valueOf(this.edgeMinValue), Float.valueOf(cut3.edgeMinValue)) && this.softEdgesSharpening == cut3.softEdgesSharpening && p0.a.g(Float.valueOf(this.softEdgesSharpeningAmount), Float.valueOf(cut3.softEdgesSharpeningAmount)) && p0.a.g(Float.valueOf(this.searchMinContrast), Float.valueOf(cut3.searchMinContrast)) && this.searchMaxDistance == cut3.searchMaxDistance;
        }

        public final float getBlendMaxContrastEdge() {
            return this.blendMaxContrastEdge;
        }

        public final float getBlendMaxSharpness() {
            return this.blendMaxSharpness;
        }

        public final float getBlendMinContrastEdge() {
            return this.blendMinContrastEdge;
        }

        public final float getBlendMinSharpness() {
            return this.blendMinSharpness;
        }

        public final float getEdgeMinValue() {
            return this.edgeMinValue;
        }

        public final boolean getEdgeUseFastLuma() {
            return this.edgeUseFastLuma;
        }

        public final int getSearchMaxDistance() {
            return this.searchMaxDistance;
        }

        public final float getSearchMinContrast() {
            return this.searchMinContrast;
        }

        public final boolean getSoftEdgesSharpening() {
            return this.softEdgesSharpening;
        }

        public final float getSoftEdgesSharpeningAmount() {
            return this.softEdgesSharpeningAmount;
        }

        public final float getStaticSharpness() {
            return this.staticSharpness;
        }

        public final boolean getUseDynamicBlend() {
            return this.useDynamicBlend;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v15 */
        /* JADX WARN: Type inference failed for: r0v16 */
        /* JADX WARN: Type inference failed for: r3v5, types: [boolean] */
        public int hashCode() {
            boolean z2 = this.useDynamicBlend;
            ?? r02 = z2;
            if (z2) {
                r02 = 1;
            }
            int b2 = d.b(this.staticSharpness, d.b(this.blendMaxSharpness, d.b(this.blendMinSharpness, d.b(this.blendMaxContrastEdge, d.b(this.blendMinContrastEdge, r02 * 31, 31), 31), 31), 31), 31);
            ?? r3 = this.edgeUseFastLuma;
            int i2 = r3;
            if (r3 != 0) {
                i2 = 1;
            }
            int b3 = d.b(this.edgeMinValue, (b2 + i2) * 31, 31);
            boolean z3 = this.softEdgesSharpening;
            return Integer.hashCode(this.searchMaxDistance) + d.b(this.searchMinContrast, d.b(this.softEdgesSharpeningAmount, (b3 + (z3 ? 1 : z3 ? 1 : 0)) * 31, 31), 31);
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder("CUT3(useDynamicBlend=");
            sb.append(this.useDynamicBlend);
            sb.append(", blendMinContrastEdge=");
            sb.append(this.blendMinContrastEdge);
            sb.append(", blendMaxContrastEdge=");
            sb.append(this.blendMaxContrastEdge);
            sb.append(", blendMinSharpness=");
            sb.append(this.blendMinSharpness);
            sb.append(", blendMaxSharpness=");
            sb.append(this.blendMaxSharpness);
            sb.append(", staticSharpness=");
            sb.append(this.staticSharpness);
            sb.append(", edgeUseFastLuma=");
            sb.append(this.edgeUseFastLuma);
            sb.append(", edgeMinValue=");
            sb.append(this.edgeMinValue);
            sb.append(", softEdgesSharpening=");
            sb.append(this.softEdgesSharpening);
            sb.append(", softEdgesSharpeningAmount=");
            sb.append(this.softEdgesSharpeningAmount);
            sb.append(", searchMinContrast=");
            sb.append(this.searchMinContrast);
            sb.append(", searchMaxDistance=");
            return d.o(sb, this.searchMaxDistance, ')');
        }

        public CUT3(boolean z2, float f2, float f3, float f4, float f5, float f6, boolean z3, float f7, boolean z4, float f8, float f9, int i2) {
            this.useDynamicBlend = z2;
            this.blendMinContrastEdge = f2;
            this.blendMaxContrastEdge = f3;
            this.blendMinSharpness = f4;
            this.blendMaxSharpness = f5;
            this.staticSharpness = f6;
            this.edgeUseFastLuma = z3;
            this.edgeMinValue = f7;
            this.softEdgesSharpening = z4;
            this.softEdgesSharpeningAmount = f8;
            this.searchMinContrast = f9;
            this.searchMaxDistance = i2;
        }

        public /* synthetic */ CUT3(boolean z2, float f2, float f3, float f4, float f5, float f6, boolean z3, float f7, boolean z4, float f8, float f9, int i2, int i3, k kVar) {
            this((i3 & 1) != 0 ? true : z2, (i3 & 2) != 0 ? 0.0f : f2, (i3 & 4) != 0 ? 0.5f : f3, (i3 & 8) == 0 ? f4 : 0.0f, (i3 & 16) != 0 ? 0.75f : f5, (i3 & 32) != 0 ? 0.75f : f6, (i3 & 64) != 0 ? false : z3, (i3 & 128) != 0 ? 0.05f : f7, (i3 & 256) == 0 ? z4 : true, (i3 & 512) != 0 ? 1.0f : f8, (i3 & 1024) == 0 ? f9 : 0.75f, (i3 & Opcodes.ACC_STRICT) != 0 ? 4 : i2);
        }
    }

    /* loaded from: classes2.dex */
    public static final class Default implements ShaderConfig {

        @NotNull
        public static final Default INSTANCE = new Default();

        private Default() {
        }
    }

    /* loaded from: classes2.dex */
    public static final class LCD implements ShaderConfig {

        @NotNull
        public static final LCD INSTANCE = new LCD();

        private LCD() {
        }
    }

    /* loaded from: classes2.dex */
    public static final class Sharp implements ShaderConfig {

        @NotNull
        public static final Sharp INSTANCE = new Sharp();

        private Sharp() {
        }
    }
}
