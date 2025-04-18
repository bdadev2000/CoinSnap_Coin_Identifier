package oe;

import android.graphics.ImageFormat;
import android.hardware.Camera;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import eb.j;
import fe.c;
import fe.d;
import ge.f;
import ge.g;
import ge.i;
import ge.k;
import ge.n;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import kotlinx.coroutines.DebugKt;
import ze.b;

/* loaded from: classes4.dex */
public final class a extends d {
    public a(Camera.Parameters parameters, int i10, boolean z10) {
        int i11;
        int i12;
        if (ke.a.a == null) {
            ke.a.a = new ke.a();
        }
        ke.a aVar = ke.a.a;
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        int numberOfCameras = Camera.getNumberOfCameras();
        for (int i13 = 0; i13 < numberOfCameras; i13++) {
            Camera.getCameraInfo(i13, cameraInfo);
            int i14 = cameraInfo.facing;
            HashMap hashMap = ke.a.f20680d;
            Integer valueOf = Integer.valueOf(i14);
            aVar.getClass();
            f fVar = (f) ke.a.a(hashMap, valueOf);
            if (fVar != null) {
                this.f17819b.add(fVar);
            }
        }
        List<String> supportedWhiteBalance = parameters.getSupportedWhiteBalance();
        if (supportedWhiteBalance != null) {
            for (String str : supportedWhiteBalance) {
                HashMap hashMap2 = ke.a.f20679c;
                aVar.getClass();
                n nVar = (n) ke.a.a(hashMap2, str);
                if (nVar != null) {
                    this.a.add(nVar);
                }
            }
        }
        this.f17820c.add(g.OFF);
        List<String> supportedFlashModes = parameters.getSupportedFlashModes();
        if (supportedFlashModes != null) {
            for (String str2 : supportedFlashModes) {
                HashMap hashMap3 = ke.a.f20678b;
                aVar.getClass();
                g gVar = (g) ke.a.a(hashMap3, str2);
                if (gVar != null) {
                    this.f17820c.add(gVar);
                }
            }
        }
        this.f17821d.add(i.OFF);
        List<String> supportedSceneModes = parameters.getSupportedSceneModes();
        if (supportedSceneModes != null) {
            for (String str3 : supportedSceneModes) {
                HashMap hashMap4 = ke.a.f20681e;
                aVar.getClass();
                i iVar = (i) ke.a.a(hashMap4, str3);
                if (iVar != null) {
                    this.f17821d.add(iVar);
                }
            }
        }
        this.f17828k = parameters.isZoomSupported();
        this.f17832o = parameters.getSupportedFocusModes().contains(DebugKt.DEBUG_PROPERTY_VALUE_AUTO);
        float exposureCompensationStep = parameters.getExposureCompensationStep();
        this.f17830m = parameters.getMinExposureCompensation() * exposureCompensationStep;
        this.f17831n = parameters.getMaxExposureCompensation() * exposureCompensationStep;
        this.f17829l = (parameters.getMinExposureCompensation() == 0 && parameters.getMaxExposureCompensation() == 0) ? false : true;
        for (Camera.Size size : parameters.getSupportedPictureSizes()) {
            int i15 = z10 ? size.height : size.width;
            int i16 = z10 ? size.width : size.height;
            this.f17822e.add(new b(i15, i16));
            this.f17824g.add(ze.a.a(i15, i16));
        }
        CamcorderProfile a = te.b.a(i10, new b(Integer.MAX_VALUE, Integer.MAX_VALUE));
        int i17 = a.videoFrameWidth;
        int i18 = a.videoFrameHeight;
        List<Camera.Size> supportedVideoSizes = parameters.getSupportedVideoSizes();
        if (supportedVideoSizes != null) {
            for (Camera.Size size2 : supportedVideoSizes) {
                int i19 = size2.width;
                if (i19 <= i17 && (i12 = size2.height) <= i18) {
                    int i20 = z10 ? i12 : i19;
                    i19 = z10 ? i19 : i12;
                    this.f17823f.add(new b(i20, i19));
                    this.f17825h.add(ze.a.a(i20, i19));
                }
            }
        } else {
            for (Camera.Size size3 : parameters.getSupportedPreviewSizes()) {
                int i21 = size3.width;
                if (i21 <= i17 && (i11 = size3.height) <= i18) {
                    int i22 = z10 ? i11 : i21;
                    i21 = z10 ? i21 : i11;
                    this.f17823f.add(new b(i22, i21));
                    this.f17825h.add(ze.a.a(i22, i21));
                }
            }
        }
        this.f17833p = Float.MAX_VALUE;
        this.f17834q = -3.4028235E38f;
        for (int[] iArr : parameters.getSupportedPreviewFpsRange()) {
            float f10 = iArr[0] / 1000.0f;
            this.f17833p = Math.min(this.f17833p, f10);
            this.f17834q = Math.max(this.f17834q, iArr[1] / 1000.0f);
        }
        this.f17826i.add(k.JPEG);
        this.f17827j.add(17);
    }

    public a(CameraManager cameraManager, String str, boolean z10, int i10) {
        boolean z11;
        CamcorderProfile camcorderProfile;
        if (ke.b.a == null) {
            ke.b.a = new ke.b();
        }
        ke.b bVar = ke.b.a;
        CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
        for (String str2 : cameraManager.getCameraIdList()) {
            Integer num = (Integer) cameraManager.getCameraCharacteristics(str2).get(CameraCharacteristics.LENS_FACING);
            if (num != null) {
                int intValue = num.intValue();
                HashMap hashMap = ke.b.f20682b;
                Integer valueOf = Integer.valueOf(intValue);
                bVar.getClass();
                f fVar = (f) ke.b.a(hashMap, valueOf);
                if (fVar != null) {
                    this.f17819b.add(fVar);
                }
            }
        }
        for (int i11 : (int[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES)) {
            HashMap hashMap2 = ke.b.f20683c;
            Integer valueOf2 = Integer.valueOf(i11);
            bVar.getClass();
            n nVar = (n) ke.b.a(hashMap2, valueOf2);
            if (nVar != null) {
                this.a.add(nVar);
            }
        }
        HashSet hashSet = this.f17820c;
        g gVar = g.OFF;
        hashSet.add(gVar);
        Boolean bool = (Boolean) cameraCharacteristics.get(CameraCharacteristics.FLASH_INFO_AVAILABLE);
        if (bool != null && bool.booleanValue()) {
            for (int i12 : (int[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES)) {
                bVar.getClass();
                HashSet hashSet2 = new HashSet();
                if (i12 != 0 && i12 != 1) {
                    if (i12 != 2) {
                        if (i12 == 3) {
                            hashSet2.add(g.ON);
                        } else if (i12 != 4) {
                        }
                    }
                    hashSet2.add(g.AUTO);
                } else {
                    hashSet2.add(gVar);
                    hashSet2.add(g.TORCH);
                }
                this.f17820c.addAll(hashSet2);
            }
        }
        this.f17821d.add(i.OFF);
        for (int i13 : (int[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AVAILABLE_SCENE_MODES)) {
            HashMap hashMap3 = ke.b.f20684d;
            Integer valueOf3 = Integer.valueOf(i13);
            bVar.getClass();
            i iVar = (i) ke.b.a(hashMap3, valueOf3);
            if (iVar != null) {
                this.f17821d.add(iVar);
            }
        }
        Float f10 = (Float) cameraCharacteristics.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
        if (f10 != null) {
            this.f17828k = f10.floatValue() > 1.0f;
        }
        Integer num2 = (Integer) cameraCharacteristics.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF);
        Integer num3 = (Integer) cameraCharacteristics.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AE);
        Integer num4 = (Integer) cameraCharacteristics.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AWB);
        this.f17832o = (num2 != null && num2.intValue() > 0) || (num3 != null && num3.intValue() > 0) || (num4 != null && num4.intValue() > 0);
        Range range = (Range) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
        Rational rational = (Rational) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_COMPENSATION_STEP);
        if (range != null && rational != null && rational.floatValue() != 0.0f) {
            this.f17830m = ((Integer) range.getLower()).intValue() / rational.floatValue();
            this.f17831n = ((Integer) range.getUpper()).intValue() / rational.floatValue();
        }
        this.f17829l = (this.f17830m == 0.0f || this.f17831n == 0.0f) ? false : true;
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap != null) {
            int[] outputFormats = streamConfigurationMap.getOutputFormats();
            int length = outputFormats.length;
            int i14 = 0;
            while (true) {
                if (i14 >= length) {
                    z11 = false;
                    break;
                } else {
                    if (outputFormats[i14] == i10) {
                        z11 = true;
                        break;
                    }
                    i14++;
                }
            }
            if (z11) {
                for (Size size : streamConfigurationMap.getOutputSizes(i10)) {
                    int height = z10 ? size.getHeight() : size.getWidth();
                    int width = z10 ? size.getWidth() : size.getHeight();
                    this.f17822e.add(new b(height, width));
                    this.f17824g.add(ze.a.a(height, width));
                }
                b bVar2 = new b(Integer.MAX_VALUE, Integer.MAX_VALUE);
                c cVar = te.b.a;
                try {
                    camcorderProfile = te.b.a(Integer.parseInt(str), bVar2);
                } catch (NumberFormatException unused) {
                    te.b.a.a(2, "NumberFormatException for Camera2 id:", str);
                    camcorderProfile = CamcorderProfile.get(0);
                }
                b bVar3 = new b(camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight);
                for (Size size2 : streamConfigurationMap.getOutputSizes(MediaRecorder.class)) {
                    if (size2.getWidth() <= bVar3.f28749b && size2.getHeight() <= bVar3.f28750c) {
                        int height2 = z10 ? size2.getHeight() : size2.getWidth();
                        int width2 = z10 ? size2.getWidth() : size2.getHeight();
                        this.f17823f.add(new b(height2, width2));
                        this.f17825h.add(ze.a.a(height2, width2));
                    }
                }
                Range[] rangeArr = (Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
                if (rangeArr != null) {
                    this.f17833p = Float.MAX_VALUE;
                    this.f17834q = -3.4028235E38f;
                    for (Range range2 : rangeArr) {
                        this.f17833p = Math.min(this.f17833p, ((Integer) range2.getLower()).intValue());
                        this.f17834q = Math.max(this.f17834q, ((Integer) range2.getUpper()).intValue());
                    }
                } else {
                    this.f17833p = 0.0f;
                    this.f17834q = 0.0f;
                }
                this.f17826i.add(k.JPEG);
                int[] iArr = (int[]) cameraCharacteristics.get(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
                if (iArr != null) {
                    for (int i15 : iArr) {
                        if (i15 == 3) {
                            this.f17826i.add(k.DNG);
                        }
                    }
                }
                this.f17827j.add(35);
                for (int i16 : streamConfigurationMap.getOutputFormats()) {
                    if (ImageFormat.getBitsPerPixel(i16) > 0) {
                        this.f17827j.add(Integer.valueOf(i16));
                    }
                }
                return;
            }
            throw new IllegalStateException(j.i("Picture format not supported: ", i10));
        }
        throw new RuntimeException("StreamConfigurationMap is null. Should not happen.");
    }
}
