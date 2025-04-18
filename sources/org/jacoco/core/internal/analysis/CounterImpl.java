package org.jacoco.core.internal.analysis;

import org.jacoco.core.analysis.ICounter;

/* loaded from: classes2.dex */
public abstract class CounterImpl implements ICounter {
    public static final CounterImpl COUNTER_0_0;
    public static final CounterImpl COUNTER_0_1;
    public static final CounterImpl COUNTER_1_0;
    private static final CounterImpl[][] SINGLETONS = new CounterImpl[31];
    private static final int SINGLETON_LIMIT = 30;
    protected int covered;
    protected int missed;

    /* renamed from: org.jacoco.core.internal.analysis.CounterImpl$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$jacoco$core$analysis$ICounter$CounterValue;

        static {
            int[] iArr = new int[ICounter.CounterValue.values().length];
            $SwitchMap$org$jacoco$core$analysis$ICounter$CounterValue = iArr;
            try {
                iArr[ICounter.CounterValue.TOTALCOUNT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$jacoco$core$analysis$ICounter$CounterValue[ICounter.CounterValue.MISSEDCOUNT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$jacoco$core$analysis$ICounter$CounterValue[ICounter.CounterValue.COVEREDCOUNT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$jacoco$core$analysis$ICounter$CounterValue[ICounter.CounterValue.MISSEDRATIO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$org$jacoco$core$analysis$ICounter$CounterValue[ICounter.CounterValue.COVEREDRATIO.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class Fix extends CounterImpl {
        public Fix(int i2, int i3) {
            super(i2, i3);
        }

        @Override // org.jacoco.core.internal.analysis.CounterImpl
        public CounterImpl increment(int i2, int i3) {
            return CounterImpl.getInstance(this.missed + i2, this.covered + i3);
        }
    }

    /* loaded from: classes2.dex */
    public static class Var extends CounterImpl {
        public Var(int i2, int i3) {
            super(i2, i3);
        }

        @Override // org.jacoco.core.internal.analysis.CounterImpl
        public CounterImpl increment(int i2, int i3) {
            this.missed += i2;
            this.covered += i3;
            return this;
        }
    }

    static {
        for (int i2 = 0; i2 <= SINGLETON_LIMIT; i2++) {
            SINGLETONS[i2] = new CounterImpl[31];
            for (int i3 = 0; i3 <= SINGLETON_LIMIT; i3++) {
                SINGLETONS[i2][i3] = new Fix(i2, i3);
            }
        }
        CounterImpl[][] counterImplArr = SINGLETONS;
        CounterImpl[] counterImplArr2 = counterImplArr[0];
        COUNTER_0_0 = counterImplArr2[0];
        COUNTER_1_0 = counterImplArr[1][0];
        COUNTER_0_1 = counterImplArr2[1];
    }

    public CounterImpl(int i2, int i3) {
        this.missed = i2;
        this.covered = i3;
    }

    public static CounterImpl getInstance(int i2, int i3) {
        if (i2 <= SINGLETON_LIMIT && i3 <= SINGLETON_LIMIT) {
            return SINGLETONS[i2][i3];
        }
        return new Var(i2, i3);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ICounter)) {
            return false;
        }
        ICounter iCounter = (ICounter) obj;
        return this.missed == iCounter.getMissedCount() && this.covered == iCounter.getCoveredCount();
    }

    @Override // org.jacoco.core.analysis.ICounter
    public int getCoveredCount() {
        return this.covered;
    }

    @Override // org.jacoco.core.analysis.ICounter
    public double getCoveredRatio() {
        return this.covered / (this.missed + r0);
    }

    @Override // org.jacoco.core.analysis.ICounter
    public int getMissedCount() {
        return this.missed;
    }

    @Override // org.jacoco.core.analysis.ICounter
    public double getMissedRatio() {
        return this.missed / (r0 + this.covered);
    }

    @Override // org.jacoco.core.analysis.ICounter
    public int getStatus() {
        int i2 = this.covered > 0 ? 2 : 0;
        return this.missed > 0 ? i2 | 1 : i2;
    }

    @Override // org.jacoco.core.analysis.ICounter
    public int getTotalCount() {
        return this.missed + this.covered;
    }

    @Override // org.jacoco.core.analysis.ICounter
    public double getValue(ICounter.CounterValue counterValue) {
        int totalCount;
        int i2 = AnonymousClass1.$SwitchMap$org$jacoco$core$analysis$ICounter$CounterValue[counterValue.ordinal()];
        if (i2 == 1) {
            totalCount = getTotalCount();
        } else if (i2 == 2) {
            totalCount = getMissedCount();
        } else {
            if (i2 != 3) {
                if (i2 == 4) {
                    return getMissedRatio();
                }
                if (i2 == 5) {
                    return getCoveredRatio();
                }
                throw new AssertionError(counterValue);
            }
            totalCount = getCoveredCount();
        }
        return totalCount;
    }

    public int hashCode() {
        return this.missed ^ (this.covered * 17);
    }

    public abstract CounterImpl increment(int i2, int i3);

    public CounterImpl increment(ICounter iCounter) {
        return increment(iCounter.getMissedCount(), iCounter.getCoveredCount());
    }

    public String toString() {
        return "Counter[" + getMissedCount() + '/' + getCoveredCount() + ']';
    }

    public static CounterImpl getInstance(ICounter iCounter) {
        return getInstance(iCounter.getMissedCount(), iCounter.getCoveredCount());
    }
}
