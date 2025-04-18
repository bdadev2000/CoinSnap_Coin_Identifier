package com.google.android.material.carousel;

import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.animation.AnimationUtils;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class KeylineState {
    private final int firstFocalKeylineIndex;
    private final float itemSize;
    private final List<Keyline> keylines;
    private final int lastFocalKeylineIndex;

    /* loaded from: classes2.dex */
    public static final class Builder {
        private static final int NO_INDEX = -1;
        private static final float UNKNOWN_LOC = Float.MIN_VALUE;
        private final float availableSpace;
        private final float itemSize;
        private Keyline tmpFirstFocalKeyline;
        private Keyline tmpLastFocalKeyline;
        private final List<Keyline> tmpKeylines = new ArrayList();
        private int firstFocalKeylineIndex = -1;
        private int lastFocalKeylineIndex = -1;
        private float lastKeylineMaskedSize = 0.0f;
        private int latestAnchorKeylineIndex = -1;

        public Builder(float f2, float f3) {
            this.itemSize = f2;
            this.availableSpace = f3;
        }

        private static float calculateKeylineLocationForItemPosition(float f2, float f3, int i2, int i3) {
            return (i3 * f3) + (f2 - (i2 * f3));
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder addAnchorKeyline(float f2, @FloatRange float f3, float f4) {
            return addKeyline(f2, f3, f4, false, true);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder addKeyline(float f2, @FloatRange float f3, float f4, boolean z2) {
            return addKeyline(f2, f3, f4, z2, false);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder addKeylineRange(float f2, @FloatRange float f3, float f4, int i2) {
            return addKeylineRange(f2, f3, f4, i2, false);
        }

        @NonNull
        public KeylineState build() {
            if (this.tmpFirstFocalKeyline == null) {
                throw new IllegalStateException("There must be a keyline marked as focal.");
            }
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < this.tmpKeylines.size(); i2++) {
                Keyline keyline = this.tmpKeylines.get(i2);
                arrayList.add(new Keyline(calculateKeylineLocationForItemPosition(this.tmpFirstFocalKeyline.locOffset, this.itemSize, this.firstFocalKeylineIndex, i2), keyline.locOffset, keyline.mask, keyline.maskedItemSize, keyline.isAnchor, keyline.cutoff, keyline.leftOrTopPaddingShift, keyline.rightOrBottomPaddingShift));
            }
            return new KeylineState(this.itemSize, arrayList, this.firstFocalKeylineIndex, this.lastFocalKeylineIndex);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder addKeyline(float f2, @FloatRange float f3, float f4) {
            return addKeyline(f2, f3, f4, false);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder addKeylineRange(float f2, @FloatRange float f3, float f4, int i2, boolean z2) {
            if (i2 > 0 && f4 > 0.0f) {
                for (int i3 = 0; i3 < i2; i3++) {
                    addKeyline((i3 * f4) + f2, f3, f4, z2);
                }
            }
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder addKeyline(float f2, @FloatRange float f3, float f4, boolean z2, boolean z3, float f5, float f6, float f7) {
            if (f4 <= 0.0f) {
                return this;
            }
            if (z3) {
                if (z2) {
                    throw new IllegalArgumentException("Anchor keylines cannot be focal.");
                }
                int i2 = this.latestAnchorKeylineIndex;
                if (i2 != -1 && i2 != 0) {
                    throw new IllegalArgumentException("Anchor keylines must be either the first or last keyline.");
                }
                this.latestAnchorKeylineIndex = this.tmpKeylines.size();
            }
            Keyline keyline = new Keyline(UNKNOWN_LOC, f2, f3, f4, z3, f5, f6, f7);
            if (z2) {
                if (this.tmpFirstFocalKeyline == null) {
                    this.tmpFirstFocalKeyline = keyline;
                    this.firstFocalKeylineIndex = this.tmpKeylines.size();
                }
                if (this.lastFocalKeylineIndex != -1 && this.tmpKeylines.size() - this.lastFocalKeylineIndex > 1) {
                    throw new IllegalArgumentException("Keylines marked as focal must be placed next to each other. There cannot be non-focal keylines between focal keylines.");
                }
                if (f4 == this.tmpFirstFocalKeyline.maskedItemSize) {
                    this.tmpLastFocalKeyline = keyline;
                    this.lastFocalKeylineIndex = this.tmpKeylines.size();
                } else {
                    throw new IllegalArgumentException("Keylines that are marked as focal must all have the same masked item size.");
                }
            } else {
                if (this.tmpFirstFocalKeyline == null && keyline.maskedItemSize < this.lastKeylineMaskedSize) {
                    throw new IllegalArgumentException("Keylines before the first focal keyline must be ordered by incrementing masked item size.");
                }
                if (this.tmpLastFocalKeyline != null && keyline.maskedItemSize > this.lastKeylineMaskedSize) {
                    throw new IllegalArgumentException("Keylines after the last focal keyline must be ordered by decreasing masked item size.");
                }
            }
            this.lastKeylineMaskedSize = keyline.maskedItemSize;
            this.tmpKeylines.add(keyline);
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder addKeyline(float f2, @FloatRange float f3, float f4, boolean z2, boolean z3, float f5) {
            return addKeyline(f2, f3, f4, z2, z3, f5, 0.0f, 0.0f);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder addKeyline(float f2, @FloatRange float f3, float f4, boolean z2, boolean z3) {
            float f5;
            float f6 = f4 / 2.0f;
            float f7 = f2 - f6;
            float f8 = f6 + f2;
            float f9 = this.availableSpace;
            if (f8 > f9) {
                f5 = Math.abs(f8 - Math.max(f8 - f4, f9));
            } else {
                f5 = 0.0f;
                if (f7 < 0.0f) {
                    f5 = Math.abs(f7 - Math.min(f7 + f4, 0.0f));
                }
            }
            return addKeyline(f2, f3, f4, z2, z3, f5);
        }
    }

    /* loaded from: classes2.dex */
    public static final class Keyline {
        final float cutoff;
        final boolean isAnchor;
        final float leftOrTopPaddingShift;
        final float loc;
        final float locOffset;
        final float mask;
        final float maskedItemSize;
        final float rightOrBottomPaddingShift;

        public Keyline(float f2, float f3, float f4, float f5) {
            this(f2, f3, f4, f5, false, 0.0f, 0.0f, 0.0f);
        }

        public static Keyline lerp(Keyline keyline, Keyline keyline2, @FloatRange float f2) {
            return new Keyline(AnimationUtils.lerp(keyline.loc, keyline2.loc, f2), AnimationUtils.lerp(keyline.locOffset, keyline2.locOffset, f2), AnimationUtils.lerp(keyline.mask, keyline2.mask, f2), AnimationUtils.lerp(keyline.maskedItemSize, keyline2.maskedItemSize, f2));
        }

        public Keyline(float f2, float f3, float f4, float f5, boolean z2, float f6, float f7, float f8) {
            this.loc = f2;
            this.locOffset = f3;
            this.mask = f4;
            this.maskedItemSize = f5;
            this.isAnchor = z2;
            this.cutoff = f6;
            this.leftOrTopPaddingShift = f7;
            this.rightOrBottomPaddingShift = f8;
        }
    }

    public static KeylineState lerp(KeylineState keylineState, KeylineState keylineState2, float f2) {
        if (keylineState.getItemSize() != keylineState2.getItemSize()) {
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same item size.");
        }
        List<Keyline> keylines = keylineState.getKeylines();
        List<Keyline> keylines2 = keylineState2.getKeylines();
        if (keylines.size() != keylines2.size()) {
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same number of keylines.");
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < keylineState.getKeylines().size(); i2++) {
            arrayList.add(Keyline.lerp(keylines.get(i2), keylines2.get(i2), f2));
        }
        return new KeylineState(keylineState.getItemSize(), arrayList, AnimationUtils.lerp(keylineState.getFirstFocalKeylineIndex(), keylineState2.getFirstFocalKeylineIndex(), f2), AnimationUtils.lerp(keylineState.getLastFocalKeylineIndex(), keylineState2.getLastFocalKeylineIndex(), f2));
    }

    public static KeylineState reverse(KeylineState keylineState, float f2) {
        Builder builder = new Builder(keylineState.getItemSize(), f2);
        float f3 = (f2 - keylineState.getLastKeyline().locOffset) - (keylineState.getLastKeyline().maskedItemSize / 2.0f);
        int size = keylineState.getKeylines().size() - 1;
        while (size >= 0) {
            Keyline keyline = keylineState.getKeylines().get(size);
            builder.addKeyline((keyline.maskedItemSize / 2.0f) + f3, keyline.mask, keyline.maskedItemSize, size >= keylineState.getFirstFocalKeylineIndex() && size <= keylineState.getLastFocalKeylineIndex(), keyline.isAnchor);
            f3 += keyline.maskedItemSize;
            size--;
        }
        return builder.build();
    }

    public Keyline getFirstFocalKeyline() {
        return this.keylines.get(this.firstFocalKeylineIndex);
    }

    public int getFirstFocalKeylineIndex() {
        return this.firstFocalKeylineIndex;
    }

    public Keyline getFirstKeyline() {
        return this.keylines.get(0);
    }

    @Nullable
    public Keyline getFirstNonAnchorKeyline() {
        for (int i2 = 0; i2 < this.keylines.size(); i2++) {
            Keyline keyline = this.keylines.get(i2);
            if (!keyline.isAnchor) {
                return keyline;
            }
        }
        return null;
    }

    public List<Keyline> getFocalKeylines() {
        return this.keylines.subList(this.firstFocalKeylineIndex, this.lastFocalKeylineIndex + 1);
    }

    public float getItemSize() {
        return this.itemSize;
    }

    public List<Keyline> getKeylines() {
        return this.keylines;
    }

    public Keyline getLastFocalKeyline() {
        return this.keylines.get(this.lastFocalKeylineIndex);
    }

    public int getLastFocalKeylineIndex() {
        return this.lastFocalKeylineIndex;
    }

    public Keyline getLastKeyline() {
        return (Keyline) androidx.compose.foundation.text.input.a.g(this.keylines, 1);
    }

    @Nullable
    public Keyline getLastNonAnchorKeyline() {
        for (int size = this.keylines.size() - 1; size >= 0; size--) {
            Keyline keyline = this.keylines.get(size);
            if (!keyline.isAnchor) {
                return keyline;
            }
        }
        return null;
    }

    public int getNumberOfNonAnchorKeylines() {
        Iterator<Keyline> it = this.keylines.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            if (it.next().isAnchor) {
                i2++;
            }
        }
        return this.keylines.size() - i2;
    }

    private KeylineState(float f2, List<Keyline> list, int i2, int i3) {
        this.itemSize = f2;
        this.keylines = Collections.unmodifiableList(list);
        this.firstFocalKeylineIndex = i2;
        this.lastFocalKeylineIndex = i3;
    }
}
