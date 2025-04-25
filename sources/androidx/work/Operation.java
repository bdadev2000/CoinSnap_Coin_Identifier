package androidx.work;

import androidx.lifecycle.LiveData;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: classes7.dex */
public interface Operation {
    public static final State.IN_PROGRESS IN_PROGRESS;
    public static final State.SUCCESS SUCCESS;

    ListenableFuture<State.SUCCESS> getResult();

    LiveData<State> getState();

    static {
        SUCCESS = new State.SUCCESS();
        IN_PROGRESS = new State.IN_PROGRESS();
    }

    /* loaded from: classes7.dex */
    public static abstract class State {
        State() {
        }

        /* loaded from: classes7.dex */
        public static final class SUCCESS extends State {
            private SUCCESS() {
            }

            public String toString() {
                return "SUCCESS";
            }
        }

        /* loaded from: classes7.dex */
        public static final class IN_PROGRESS extends State {
            private IN_PROGRESS() {
            }

            public String toString() {
                return "IN_PROGRESS";
            }
        }

        /* loaded from: classes7.dex */
        public static final class FAILURE extends State {
            private final Throwable mThrowable;

            public FAILURE(Throwable exception) {
                this.mThrowable = exception;
            }

            public Throwable getThrowable() {
                return this.mThrowable;
            }

            public String toString() {
                return String.format("FAILURE (%s)", this.mThrowable.getMessage());
            }
        }
    }
}
