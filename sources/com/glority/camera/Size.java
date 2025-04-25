package com.glority.camera;

/* loaded from: classes6.dex */
public class Size implements Comparable<Size> {
    private final int mHeight;
    private final int mWidth;

    public Size(int i, int i2) {
        this.mWidth = i;
        this.mHeight = i2;
    }

    public int getWidth() {
        return this.mWidth;
    }

    public int getHeight() {
        return this.mHeight;
    }

    public int hashCode() {
        int i = this.mHeight;
        int i2 = this.mWidth;
        return i ^ ((i2 >>> 16) | (i2 << 16));
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Size)) {
            return false;
        }
        Size size = (Size) obj;
        return this.mWidth == size.mWidth && this.mHeight == size.mHeight;
    }

    @Override // java.lang.Comparable
    public int compareTo(Size size) {
        int i = this.mWidth;
        int i2 = this.mHeight;
        return (i * i2) - (size.mWidth * i2);
    }

    public String toString() {
        return this.mWidth + "x" + this.mHeight;
    }
}
