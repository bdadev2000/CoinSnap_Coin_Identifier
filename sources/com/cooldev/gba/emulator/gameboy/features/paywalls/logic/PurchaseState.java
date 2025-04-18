package com.cooldev.gba.emulator.gameboy.features.paywalls.logic;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes2.dex */
public abstract class PurchaseState {
    public static final int $stable = 0;

    @StabilityInferred
    /* loaded from: classes2.dex */
    public static final class Error extends PurchaseState {
        public static final int $stable = 0;

        @NotNull
        public static final Error INSTANCE = new Error();

        private Error() {
            super(null);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 442273128;
        }

        @NotNull
        public String toString() {
            return "Error";
        }
    }

    @StabilityInferred
    /* loaded from: classes2.dex */
    public static final class Pending extends PurchaseState {
        public static final int $stable = 0;

        @NotNull
        public static final Pending INSTANCE = new Pending();

        private Pending() {
            super(null);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Pending)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 619113719;
        }

        @NotNull
        public String toString() {
            return "Pending";
        }
    }

    @StabilityInferred
    /* loaded from: classes2.dex */
    public static final class Purchased extends PurchaseState {
        public static final int $stable = 0;

        @NotNull
        public static final Purchased INSTANCE = new Purchased();

        private Purchased() {
            super(null);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Purchased)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -691886365;
        }

        @NotNull
        public String toString() {
            return "Purchased";
        }
    }

    @StabilityInferred
    /* loaded from: classes2.dex */
    public static final class PurchasedAndAcknowledged extends PurchaseState {
        public static final int $stable = 0;

        @NotNull
        public static final PurchasedAndAcknowledged INSTANCE = new PurchasedAndAcknowledged();

        private PurchasedAndAcknowledged() {
            super(null);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PurchasedAndAcknowledged)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -390249636;
        }

        @NotNull
        public String toString() {
            return "PurchasedAndAcknowledged";
        }
    }

    private PurchaseState() {
    }

    public /* synthetic */ PurchaseState(k kVar) {
        this();
    }
}
