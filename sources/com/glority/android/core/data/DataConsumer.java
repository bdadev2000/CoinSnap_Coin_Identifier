package com.glority.android.core.data;

import androidx.collection.ArrayMap;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import com.glority.utils.stability.LogUtils;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

/* compiled from: DataConsumer.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 \u0010*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0001\u0010J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0006J\u001e\u0010\u0007\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0015\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0006J\u0016\u0010\u000e\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\tH\u0016J\b\u0010\u000f\u001a\u00020\u0004H\u0016¨\u0006\u0011"}, d2 = {"Lcom/glority/android/core/data/DataConsumer;", ExifInterface.GPS_DIRECTION_TRUE, "Lio/reactivex/functions/Consumer;", "accept", "", "data", "(Ljava/lang/Object;)V", "bind", "provider", "Lcom/glority/android/core/data/DataProvider;", "", "disposable", "Lio/reactivex/disposables/Disposable;", "consume", "onComplete", "stopConsumer", "Companion", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public interface DataConsumer<T> extends Consumer<T> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Override // io.reactivex.functions.Consumer
    void accept(T data);

    void bind(DataProvider<Object> provider, Disposable disposable);

    void consume(T data);

    void onComplete(DataProvider<?> provider);

    void stopConsumer();

    /* compiled from: DataConsumer.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes7.dex */
    public static final class DefaultImpls {
        public static <T> void bind(DataConsumer<T> dataConsumer, DataProvider<Object> provider, Disposable disposable) {
            Intrinsics.checkNotNullParameter(dataConsumer, "this");
            Intrinsics.checkNotNullParameter(provider, "provider");
            Intrinsics.checkNotNullParameter(disposable, "disposable");
            synchronized (dataConsumer) {
                ArrayMap<DataProvider<Object>, Disposable> arrayMap = DataConsumer.INSTANCE.getDisposables().get(dataConsumer);
                if (arrayMap == null) {
                    arrayMap = new ArrayMap<>();
                }
                Disposable disposable2 = arrayMap.get(provider);
                if (disposable2 != null) {
                    disposable2.dispose();
                }
                arrayMap.put(provider, disposable);
                DataConsumer.INSTANCE.getDisposables().put(dataConsumer, arrayMap);
                Unit unit = Unit.INSTANCE;
            }
        }

        public static <T> void accept(DataConsumer<T> dataConsumer, T t) {
            Intrinsics.checkNotNullParameter(dataConsumer, "this");
            try {
                dataConsumer.consume(t);
            } catch (Exception e) {
                LogUtils.e(e, "DataConsumer");
            }
        }

        public static <T> void onComplete(DataConsumer<T> dataConsumer, DataProvider<?> dataProvider) {
            ArrayMap<DataProvider<Object>, Disposable> arrayMap;
            Intrinsics.checkNotNullParameter(dataConsumer, "this");
            if (dataProvider == null || (arrayMap = DataConsumer.INSTANCE.getDisposables().get(dataConsumer)) == null) {
                return;
            }
            ArrayMap<DataProvider<Object>, Disposable> arrayMap2 = arrayMap;
            Disposable disposable = arrayMap2.get(dataProvider);
            if (disposable != null) {
                disposable.dispose();
            }
            TypeIntrinsics.asMutableMap(arrayMap2).remove(dataProvider);
            if (arrayMap.getSize() == 0) {
                DataConsumer.INSTANCE.getDisposables().remove(dataConsumer);
            }
        }

        public static <T> void stopConsumer(DataConsumer<T> dataConsumer) {
            Intrinsics.checkNotNullParameter(dataConsumer, "this");
            ArrayMap<DataProvider<Object>, Disposable> arrayMap = DataConsumer.INSTANCE.getDisposables().get(dataConsumer);
            if (arrayMap != null) {
                Iterator<Map.Entry<DataProvider<Object>, Disposable>> it = arrayMap.entrySet().iterator();
                while (it.hasNext()) {
                    it.next().getValue().dispose();
                }
                arrayMap.clear();
                DataConsumer.INSTANCE.getDisposables().remove(dataConsumer);
            }
        }
    }

    /* compiled from: DataConsumer.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R7\u0010\u0003\u001a(\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0005\u0012\u0018\u0012\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/glority/android/core/data/DataConsumer$Companion;", "", "()V", "disposables", "Landroidx/collection/ArrayMap;", "Lcom/glority/android/core/data/DataConsumer;", "Lcom/glority/android/core/data/DataProvider;", "Lio/reactivex/disposables/Disposable;", "getDisposables", "()Landroidx/collection/ArrayMap;", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes7.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final ArrayMap<DataConsumer<Object>, ArrayMap<DataProvider<Object>, Disposable>> disposables = new ArrayMap<>();

        private Companion() {
        }

        public final ArrayMap<DataConsumer<Object>, ArrayMap<DataProvider<Object>, Disposable>> getDisposables() {
            return disposables;
        }
    }
}
