package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.vector.PathNode;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.List;
import org.objectweb.asm.Opcodes;

/* loaded from: classes4.dex */
public final class PathParserKt {
    public static final void a(Path path, double d, double d2, double d3, double d4, double d5, double d6, double d7, boolean z2, boolean z3) {
        double d8;
        double d9;
        double d10 = d5;
        double d11 = (d7 / Opcodes.GETFIELD) * 3.141592653589793d;
        double cos = Math.cos(d11);
        double sin = Math.sin(d11);
        double d12 = ((d2 * sin) + (d * cos)) / d10;
        double d13 = ((d2 * cos) + ((-d) * sin)) / d6;
        double d14 = ((d4 * sin) + (d3 * cos)) / d10;
        double d15 = ((d4 * cos) + ((-d3) * sin)) / d6;
        double d16 = d12 - d14;
        double d17 = d13 - d15;
        double d18 = 2;
        double d19 = (d12 + d14) / d18;
        double d20 = (d13 + d15) / d18;
        double d21 = (d17 * d17) + (d16 * d16);
        if (d21 == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            return;
        }
        double d22 = (1.0d / d21) - 0.25d;
        if (d22 < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            double sqrt = (float) (Math.sqrt(d21) / 1.99999d);
            a(path, d, d2, d3, d4, d10 * sqrt, d6 * sqrt, d7, z2, z3);
            return;
        }
        double sqrt2 = Math.sqrt(d22);
        double d23 = d16 * sqrt2;
        double d24 = sqrt2 * d17;
        if (z2 == z3) {
            d8 = d19 - d24;
            d9 = d20 + d23;
        } else {
            d8 = d19 + d24;
            d9 = d20 - d23;
        }
        double atan2 = Math.atan2(d13 - d9, d12 - d8);
        double atan22 = Math.atan2(d15 - d9, d14 - d8) - atan2;
        if (z3 != (atan22 >= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE)) {
            atan22 = atan22 > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
        }
        double d25 = d8 * d10;
        double d26 = d9 * d6;
        double d27 = (d25 * cos) - (d26 * sin);
        double d28 = (d26 * cos) + (d25 * sin);
        double d29 = 4;
        int ceil = (int) Math.ceil(Math.abs((atan22 * d29) / 3.141592653589793d));
        double cos2 = Math.cos(d11);
        double sin2 = Math.sin(d11);
        double cos3 = Math.cos(atan2);
        double sin3 = Math.sin(atan2);
        double d30 = -d10;
        double d31 = d30 * cos2;
        double d32 = d6 * sin2;
        double d33 = (d31 * sin3) - (d32 * cos3);
        double d34 = d30 * sin2;
        double d35 = d6 * cos2;
        double d36 = (cos3 * d35) + (sin3 * d34);
        double d37 = atan22 / ceil;
        double d38 = d;
        double d39 = atan2;
        double d40 = d33;
        int i2 = 0;
        double d41 = d36;
        double d42 = d2;
        while (i2 < ceil) {
            double d43 = d39 + d37;
            double sin4 = Math.sin(d43);
            double cos4 = Math.cos(d43);
            double d44 = d37;
            double d45 = (((d10 * cos2) * cos4) + d27) - (d32 * sin4);
            int i3 = ceil;
            double d46 = (d35 * sin4) + (d10 * sin2 * cos4) + d28;
            double d47 = (d31 * sin4) - (d32 * cos4);
            double d48 = (cos4 * d35) + (sin4 * d34);
            double d49 = d43 - d39;
            double tan = Math.tan(d49 / d18);
            double sqrt3 = ((Math.sqrt(((3.0d * tan) * tan) + d29) - 1) * Math.sin(d49)) / 3;
            path.o((float) ((d40 * sqrt3) + d38), (float) ((d41 * sqrt3) + d42), (float) (d45 - (sqrt3 * d47)), (float) (d46 - (sqrt3 * d48)), (float) d45, (float) d46);
            i2++;
            sin2 = sin2;
            cos2 = cos2;
            d38 = d45;
            d42 = d46;
            ceil = i3;
            d39 = d43;
            d41 = d48;
            d40 = d47;
            d37 = d44;
            d10 = d5;
        }
    }

    public static final void b(List list, Path path) {
        PathNode pathNode;
        float f2;
        int i2;
        int i3;
        PathNode pathNode2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        List list2 = list;
        Path path2 = path;
        int m2 = path.m();
        path.j();
        path2.g(m2);
        PathNode pathNode3 = list.isEmpty() ? PathNode.Close.f15356c : (PathNode) list2.get(0);
        int size = list.size();
        float f16 = 0.0f;
        int i4 = 0;
        float f17 = 0.0f;
        float f18 = 0.0f;
        float f19 = 0.0f;
        float f20 = 0.0f;
        float f21 = 0.0f;
        float f22 = 0.0f;
        while (i4 < size) {
            PathNode pathNode4 = (PathNode) list2.get(i4);
            if (pathNode4 instanceof PathNode.Close) {
                path.close();
                pathNode2 = pathNode4;
                f2 = f16;
                i2 = i4;
                i3 = size;
                f17 = f21;
                f19 = f17;
                f18 = f22;
            } else {
                if (pathNode4 instanceof PathNode.RelativeMoveTo) {
                    PathNode.RelativeMoveTo relativeMoveTo = (PathNode.RelativeMoveTo) pathNode4;
                    float f23 = relativeMoveTo.f15380c;
                    f19 += f23;
                    float f24 = relativeMoveTo.d;
                    f20 += f24;
                    path2.c(f23, f24);
                    f21 = f19;
                    f22 = f20;
                } else if (pathNode4 instanceof PathNode.MoveTo) {
                    PathNode.MoveTo moveTo = (PathNode.MoveTo) pathNode4;
                    float f25 = moveTo.f15363c;
                    float f26 = moveTo.d;
                    path2.n(f25, f26);
                    f20 = f26;
                    f22 = f20;
                    f19 = f25;
                    f21 = f19;
                } else if (pathNode4 instanceof PathNode.RelativeLineTo) {
                    PathNode.RelativeLineTo relativeLineTo = (PathNode.RelativeLineTo) pathNode4;
                    float f27 = relativeLineTo.f15379c;
                    float f28 = relativeLineTo.d;
                    path2.r(f27, f28);
                    f19 += relativeLineTo.f15379c;
                    f20 += f28;
                } else {
                    if (pathNode4 instanceof PathNode.LineTo) {
                        PathNode.LineTo lineTo = (PathNode.LineTo) pathNode4;
                        float f29 = lineTo.f15362c;
                        f7 = lineTo.d;
                        path2.u(f29, f7);
                        f19 = lineTo.f15362c;
                    } else if (pathNode4 instanceof PathNode.RelativeHorizontalTo) {
                        PathNode.RelativeHorizontalTo relativeHorizontalTo = (PathNode.RelativeHorizontalTo) pathNode4;
                        path2.r(relativeHorizontalTo.f15378c, f16);
                        f19 += relativeHorizontalTo.f15378c;
                    } else if (pathNode4 instanceof PathNode.HorizontalTo) {
                        PathNode.HorizontalTo horizontalTo = (PathNode.HorizontalTo) pathNode4;
                        path2.u(horizontalTo.f15361c, f20);
                        f19 = horizontalTo.f15361c;
                    } else if (pathNode4 instanceof PathNode.RelativeVerticalTo) {
                        PathNode.RelativeVerticalTo relativeVerticalTo = (PathNode.RelativeVerticalTo) pathNode4;
                        path2.r(f16, relativeVerticalTo.f15386c);
                        f20 += relativeVerticalTo.f15386c;
                    } else if (pathNode4 instanceof PathNode.VerticalTo) {
                        PathNode.VerticalTo verticalTo = (PathNode.VerticalTo) pathNode4;
                        path2.u(f19, verticalTo.f15387c);
                        f20 = verticalTo.f15387c;
                    } else {
                        if (pathNode4 instanceof PathNode.RelativeCurveTo) {
                            PathNode.RelativeCurveTo relativeCurveTo = (PathNode.RelativeCurveTo) pathNode4;
                            path.d(relativeCurveTo.f15374c, relativeCurveTo.d, relativeCurveTo.e, relativeCurveTo.f15375f, relativeCurveTo.f15376g, relativeCurveTo.f15377h);
                            f5 = relativeCurveTo.e + f19;
                            f6 = relativeCurveTo.f15375f + f20;
                            f19 += relativeCurveTo.f15376g;
                            f15 = relativeCurveTo.f15377h;
                        } else {
                            if (pathNode4 instanceof PathNode.CurveTo) {
                                PathNode.CurveTo curveTo = (PathNode.CurveTo) pathNode4;
                                path.o(curveTo.f15357c, curveTo.d, curveTo.e, curveTo.f15358f, curveTo.f15359g, curveTo.f15360h);
                                f5 = curveTo.e;
                                f10 = curveTo.f15358f;
                                f11 = curveTo.f15359g;
                                f12 = curveTo.f15360h;
                            } else if (pathNode4 instanceof PathNode.RelativeReflectiveCurveTo) {
                                if (pathNode3.f15349a) {
                                    f14 = f20 - f18;
                                    f13 = f19 - f17;
                                } else {
                                    f13 = f16;
                                    f14 = f13;
                                }
                                PathNode.RelativeReflectiveCurveTo relativeReflectiveCurveTo = (PathNode.RelativeReflectiveCurveTo) pathNode4;
                                path.d(f13, f14, relativeReflectiveCurveTo.f15383c, relativeReflectiveCurveTo.d, relativeReflectiveCurveTo.e, relativeReflectiveCurveTo.f15384f);
                                f5 = relativeReflectiveCurveTo.f15383c + f19;
                                f6 = relativeReflectiveCurveTo.d + f20;
                                f19 += relativeReflectiveCurveTo.e;
                                f15 = relativeReflectiveCurveTo.f15384f;
                            } else if (pathNode4 instanceof PathNode.ReflectiveCurveTo) {
                                if (pathNode3.f15349a) {
                                    float f30 = 2;
                                    f9 = (f30 * f20) - f18;
                                    f8 = (f19 * f30) - f17;
                                } else {
                                    f8 = f19;
                                    f9 = f20;
                                }
                                PathNode.ReflectiveCurveTo reflectiveCurveTo = (PathNode.ReflectiveCurveTo) pathNode4;
                                path.o(f8, f9, reflectiveCurveTo.f15366c, reflectiveCurveTo.d, reflectiveCurveTo.e, reflectiveCurveTo.f15367f);
                                f5 = reflectiveCurveTo.f15366c;
                                f10 = reflectiveCurveTo.d;
                                f11 = reflectiveCurveTo.e;
                                f12 = reflectiveCurveTo.f15367f;
                            } else if (pathNode4 instanceof PathNode.RelativeQuadTo) {
                                PathNode.RelativeQuadTo relativeQuadTo = (PathNode.RelativeQuadTo) pathNode4;
                                float f31 = relativeQuadTo.f15381c;
                                float f32 = relativeQuadTo.d;
                                float f33 = relativeQuadTo.e;
                                float f34 = relativeQuadTo.f15382f;
                                path2.l(f31, f32, f33, f34);
                                float f35 = relativeQuadTo.f15381c + f19;
                                f18 = f32 + f20;
                                f19 += f33;
                                f20 += f34;
                                f17 = f35;
                            } else if (pathNode4 instanceof PathNode.QuadTo) {
                                PathNode.QuadTo quadTo = (PathNode.QuadTo) pathNode4;
                                float f36 = quadTo.f15364c;
                                f18 = quadTo.d;
                                float f37 = quadTo.e;
                                f7 = quadTo.f15365f;
                                path2.h(f36, f18, f37, f7);
                                f17 = quadTo.f15364c;
                                f19 = f37;
                            } else if (pathNode4 instanceof PathNode.RelativeReflectiveQuadTo) {
                                if (pathNode3.f15350b) {
                                    f3 = f19 - f17;
                                    f4 = f20 - f18;
                                } else {
                                    f3 = f16;
                                    f4 = f3;
                                }
                                PathNode.RelativeReflectiveQuadTo relativeReflectiveQuadTo = (PathNode.RelativeReflectiveQuadTo) pathNode4;
                                float f38 = relativeReflectiveQuadTo.f15385c;
                                float f39 = relativeReflectiveQuadTo.d;
                                path2.l(f3, f4, f38, f39);
                                f5 = f3 + f19;
                                f6 = f4 + f20;
                                f19 += relativeReflectiveQuadTo.f15385c;
                                f20 += f39;
                                f18 = f6;
                                pathNode2 = pathNode4;
                                f2 = f16;
                                i2 = i4;
                                i3 = size;
                                f17 = f5;
                                i4 = i2 + 1;
                                list2 = list;
                                path2 = path;
                                pathNode3 = pathNode2;
                                f16 = f2;
                                size = i3;
                            } else {
                                if (pathNode4 instanceof PathNode.ReflectiveQuadTo) {
                                    if (pathNode3.f15350b) {
                                        float f40 = 2;
                                        f19 = (f19 * f40) - f17;
                                        f20 = (f40 * f20) - f18;
                                    }
                                    PathNode.ReflectiveQuadTo reflectiveQuadTo = (PathNode.ReflectiveQuadTo) pathNode4;
                                    float f41 = reflectiveQuadTo.f15368c;
                                    float f42 = reflectiveQuadTo.d;
                                    path2.h(f19, f20, f41, f42);
                                    f17 = f19;
                                    pathNode2 = pathNode4;
                                    f2 = f16;
                                    i2 = i4;
                                    i3 = size;
                                    f19 = reflectiveQuadTo.f15368c;
                                    float f43 = f20;
                                    f20 = f42;
                                    f18 = f43;
                                } else {
                                    if (pathNode4 instanceof PathNode.RelativeArcTo) {
                                        PathNode.RelativeArcTo relativeArcTo = (PathNode.RelativeArcTo) pathNode4;
                                        float f44 = relativeArcTo.f15372h + f19;
                                        float f45 = relativeArcTo.f15373i + f20;
                                        i3 = size;
                                        pathNode = pathNode4;
                                        i2 = i4;
                                        f2 = 0.0f;
                                        a(path, f19, f20, f44, f45, relativeArcTo.f15369c, relativeArcTo.d, relativeArcTo.e, relativeArcTo.f15370f, relativeArcTo.f15371g);
                                        f17 = f44;
                                        f19 = f17;
                                        f18 = f45;
                                        f20 = f18;
                                    } else {
                                        pathNode = pathNode4;
                                        f2 = f16;
                                        i2 = i4;
                                        i3 = size;
                                        if (pathNode instanceof PathNode.ArcTo) {
                                            PathNode.ArcTo arcTo = (PathNode.ArcTo) pathNode;
                                            double d = arcTo.f15354h;
                                            float f46 = arcTo.f15355i;
                                            pathNode2 = pathNode;
                                            a(path, f19, f20, d, f46, arcTo.f15351c, arcTo.d, arcTo.e, arcTo.f15352f, arcTo.f15353g);
                                            f17 = arcTo.f15354h;
                                            f19 = f17;
                                            f18 = f46;
                                        }
                                    }
                                    pathNode2 = pathNode;
                                }
                                i4 = i2 + 1;
                                list2 = list;
                                path2 = path;
                                pathNode3 = pathNode2;
                                f16 = f2;
                                size = i3;
                            }
                            f19 = f11;
                            f20 = f12;
                            pathNode2 = pathNode4;
                            f2 = f16;
                            i2 = i4;
                            i3 = size;
                            f18 = f10;
                            f17 = f5;
                            i4 = i2 + 1;
                            list2 = list;
                            path2 = path;
                            pathNode3 = pathNode2;
                            f16 = f2;
                            size = i3;
                        }
                        f20 += f15;
                        f18 = f6;
                        pathNode2 = pathNode4;
                        f2 = f16;
                        i2 = i4;
                        i3 = size;
                        f17 = f5;
                        i4 = i2 + 1;
                        list2 = list;
                        path2 = path;
                        pathNode3 = pathNode2;
                        f16 = f2;
                        size = i3;
                    }
                    f20 = f7;
                }
                pathNode2 = pathNode4;
                f2 = f16;
                i2 = i4;
                i3 = size;
                i4 = i2 + 1;
                list2 = list;
                path2 = path;
                pathNode3 = pathNode2;
                f16 = f2;
                size = i3;
            }
            f20 = f18;
            i4 = i2 + 1;
            list2 = list;
            path2 = path;
            pathNode3 = pathNode2;
            f16 = f2;
            size = i3;
        }
    }
}
