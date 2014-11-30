LOCAL_PATH:= $(call my-dir)
include $(CLEAR_VARS)

LOCAL_SRC_FILES += $(call all-java-files-under, src)

LOCAL_STATIC_JAVA_LIBRARIES := \
    android-support-v4_13 \
    volley \
    libGoogleAnalyticsServices

LOCAL_PACKAGE_NAME := VentureBox
LOCAL_CERTIFICATE := platform
LOCAL_PRIVILEGED_MODULE := true

LOCAL_SDK_VERSION := 21

include $(BUILD_PACKAGE)

# Support library v4
include $(CLEAR_VARS)

LOCAL_PREBUILT_STATIC_JAVA_LIBRARIES := \
    android-support-v4_13:/libs/android-support-v4.jar \
    libGoogleAnalyticsServices:/libs/libGoogleAnalyticsServices.jar

include $(BUILD_MULTI_PREBUILT)
