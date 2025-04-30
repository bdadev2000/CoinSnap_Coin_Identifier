package com.google.ar.core;

import androidx.annotation.NonNull;
import com.google.ar.core.annotations.UsedByNative;
import java.util.Locale;

@UsedByNative("session_jni_wrapper.cc")
/* loaded from: classes2.dex */
public class Pose {
    public static final Pose IDENTITY = new Pose(new float[]{0.0f, 0.0f, 0.0f}, Quaternion.f14273a);

    @UsedByNative("session_jni_wrapper.cc")
    private final Quaternion quaternion;

    @UsedByNative("session_jni_wrapper.cc")
    private final float[] translation;

    @UsedByNative("session_jni_wrapper.cc")
    private Pose(float[] fArr, Quaternion quaternion) {
        this.translation = fArr;
        this.quaternion = quaternion;
    }

    @NonNull
    public static Pose makeInterpolated(Pose pose, Pose pose2, float f9) {
        if (f9 == 0.0f) {
            return pose;
        }
        if (f9 == 1.0f) {
            return pose2;
        }
        float[] fArr = new float[3];
        for (int i9 = 0; i9 < 3; i9++) {
            fArr[i9] = (pose2.translation[i9] * f9) + ((1.0f - f9) * pose.translation[i9]);
        }
        return new Pose(fArr, Quaternion.h(pose.quaternion, pose2.quaternion, f9));
    }

    @NonNull
    public static Pose makeRotation(float f9, float f10, float f11, float f12) {
        return new Pose(IDENTITY.translation, new Quaternion(f9, f10, f11, f12));
    }

    @NonNull
    public static Pose makeTranslation(float f9, float f10, float f11) {
        return new Pose(new float[]{f9, f10, f11}, IDENTITY.quaternion);
    }

    @NonNull
    public Pose compose(Pose pose) {
        Quaternion.i(this.quaternion, pose.translation, 0, r0, 0);
        float f9 = r0[0];
        float[] fArr = this.translation;
        float[] fArr2 = {f9 + fArr[0], fArr2[1] + fArr[1], fArr2[2] + fArr[2]};
        return new Pose(fArr2, this.quaternion.g(pose.quaternion));
    }

    @NonNull
    public Pose extractRotation() {
        return new Pose(IDENTITY.translation, this.quaternion);
    }

    public Pose extractTranslation() {
        return new Pose(this.translation, IDENTITY.quaternion);
    }

    public Quaternion getQuaternion() {
        return this.quaternion;
    }

    public float[] getRotationQuaternion() {
        float[] fArr = new float[4];
        getRotationQuaternion(fArr, 0);
        return fArr;
    }

    public float[] getTransformedAxis(int i9, float f9) {
        float[] fArr = new float[3];
        getTransformedAxis(i9, f9, fArr, 0);
        return fArr;
    }

    public float[] getTranslation() {
        float[] fArr = new float[3];
        getTranslation(fArr, 0);
        return fArr;
    }

    public float[] getXAxis() {
        return getTransformedAxis(0, 1.0f);
    }

    public float[] getYAxis() {
        return getTransformedAxis(1, 1.0f);
    }

    public float[] getZAxis() {
        return getTransformedAxis(2, 1.0f);
    }

    @NonNull
    public Pose inverse() {
        Quaternion f9 = this.quaternion.f();
        Quaternion.i(f9, this.translation, 0, r1, 0);
        float[] fArr = {-fArr[0], -fArr[1], -fArr[2]};
        return new Pose(fArr, f9);
    }

    public float qw() {
        return this.quaternion.d();
    }

    public float qx() {
        return this.quaternion.a();
    }

    public float qy() {
        return this.quaternion.b();
    }

    public float qz() {
        return this.quaternion.c();
    }

    public float[] rotateVector(float[] fArr) {
        float[] fArr2 = new float[3];
        rotateVector(fArr, 0, fArr2, 0);
        return fArr2;
    }

    public void toMatrix(float[] fArr, int i9) {
        this.quaternion.j(fArr, i9);
        float[] fArr2 = this.translation;
        fArr[i9 + 12] = fArr2[0];
        fArr[i9 + 13] = fArr2[1];
        fArr[i9 + 14] = fArr2[2];
        fArr[i9 + 3] = 0.0f;
        fArr[i9 + 7] = 0.0f;
        fArr[i9 + 11] = 0.0f;
        fArr[i9 + 15] = 1.0f;
    }

    public String toString() {
        return String.format(Locale.ENGLISH, "t:[x:%.3f, y:%.3f, z:%.3f], q:[x:%.2f, y:%.2f, z:%.2f, w:%.2f]", Float.valueOf(this.translation[0]), Float.valueOf(this.translation[1]), Float.valueOf(this.translation[2]), Float.valueOf(this.quaternion.a()), Float.valueOf(this.quaternion.b()), Float.valueOf(this.quaternion.c()), Float.valueOf(this.quaternion.d()));
    }

    public float[] transformPoint(float[] fArr) {
        float[] fArr2 = new float[3];
        transformPoint(fArr, 0, fArr2, 0);
        return fArr2;
    }

    public float tx() {
        return this.translation[0];
    }

    public float ty() {
        return this.translation[1];
    }

    public float tz() {
        return this.translation[2];
    }

    private Pose(float f9, float f10, float f11, float f12, float f13, float f14, float f15) {
        this.quaternion = new Quaternion(f12, f13, f14, f15);
        this.translation = new float[]{f9, f10, f11};
    }

    @NonNull
    public static Pose makeRotation(float[] fArr) {
        return makeRotation(fArr[0], fArr[1], fArr[2], fArr[3]);
    }

    @NonNull
    public static Pose makeTranslation(float[] fArr) {
        return makeTranslation(fArr[0], fArr[1], fArr[2]);
    }

    public void getRotationQuaternion(float[] fArr, int i9) {
        this.quaternion.e(fArr, i9);
    }

    public void getTransformedAxis(int i9, float f9, float[] fArr, int i10) {
        float[] fArr2 = new float[3];
        fArr2[0] = 0.0f;
        fArr2[1] = 0.0f;
        fArr2[2] = 0.0f;
        fArr2[i9] = f9;
        Quaternion.i(this.quaternion, fArr2, 0, fArr, i10);
    }

    public void getTranslation(float[] fArr, int i9) {
        System.arraycopy(this.translation, 0, fArr, i9, 3);
    }

    public void rotateVector(float[] fArr, int i9, float[] fArr2, int i10) {
        Quaternion.i(this.quaternion, fArr, i9, fArr2, i10);
    }

    public void transformPoint(float[] fArr, int i9, float[] fArr2, int i10) {
        rotateVector(fArr, i9, fArr2, i10);
        for (int i11 = 0; i11 < 3; i11++) {
            int i12 = i11 + i10;
            fArr2[i12] = fArr2[i12] + this.translation[i11];
        }
    }

    public Pose(float[] fArr, float[] fArr2) {
        this(fArr[0], fArr[1], fArr[2], fArr2[0], fArr2[1], fArr2[2], fArr2[3]);
    }
}
