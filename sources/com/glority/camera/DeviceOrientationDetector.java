package com.glority.camera;

import android.util.Log;
import android.util.SparseIntArray;
import android.view.OrientationEventListener;
import com.glority.utils.UtilsApp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
class DeviceOrientationDetector {
    private static final SparseIntArray DISPLAY_ORIENTATIONS;
    private static DeviceOrientationDetector instance;
    private List<DeviceOrientationChangedListener> orientationChangedListeners = new ArrayList();
    private int lastKnownDeviceOrientation = 0;
    private OrientationEventListener orientationEventListener = new OrientationEventListener(UtilsApp.getApp()) { // from class: com.glority.camera.DeviceOrientationDetector.1
        @Override // android.view.OrientationEventListener
        public void onOrientationChanged(int i) {
            int calcDeviceOrientation;
            Log.d("OrientationDetector", "onOrientationChanged: " + i);
            if (i == -1 || (calcDeviceOrientation = DeviceOrientationDetector.this.calcDeviceOrientation(i)) == DeviceOrientationDetector.this.lastKnownDeviceOrientation) {
                return;
            }
            Log.d("OrientationDetector", "deviceOrientationChanged: " + calcDeviceOrientation);
            DeviceOrientationDetector.this.lastKnownDeviceOrientation = calcDeviceOrientation;
            Iterator it = DeviceOrientationDetector.this.orientationChangedListeners.iterator();
            while (it.hasNext()) {
                ((DeviceOrientationChangedListener) it.next()).onDeviceOrientationChanged(calcDeviceOrientation);
            }
        }
    };

    /* loaded from: classes6.dex */
    interface DeviceOrientationChangedListener {
        void onDeviceOrientationChanged(int i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static DeviceOrientationDetector getInstance() {
        if (instance == null) {
            synchronized (DeviceOrientationDetector.class) {
                if (instance == null) {
                    instance = new DeviceOrientationDetector();
                }
            }
        }
        return instance;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        DISPLAY_ORIENTATIONS = sparseIntArray;
        sparseIntArray.put(0, 0);
        sparseIntArray.put(1, 90);
        sparseIntArray.put(2, 180);
        sparseIntArray.put(3, 270);
    }

    private DeviceOrientationDetector() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int calcDeviceOrientation(int i) {
        return DISPLAY_ORIENTATIONS.get(((i + 45) / 90) % 4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void enable() {
        this.orientationEventListener.enable();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void disable() {
        this.orientationEventListener.disable();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getLastKnownDeviceOrientation() {
        return this.lastKnownDeviceOrientation;
    }

    void addListener(DeviceOrientationChangedListener deviceOrientationChangedListener) {
        this.orientationChangedListeners.add(deviceOrientationChangedListener);
    }

    void removeListener(DeviceOrientationChangedListener deviceOrientationChangedListener) {
        this.orientationChangedListeners.remove(deviceOrientationChangedListener);
    }
}
