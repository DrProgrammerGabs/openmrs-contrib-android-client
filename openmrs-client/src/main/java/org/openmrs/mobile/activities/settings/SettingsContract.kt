/*
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs.mobile.activities.settings

import org.openmrs.mobile.activities.BasePresenterContract
import org.openmrs.mobile.activities.BaseView

interface SettingsContract {
    interface View : BaseView<Presenter> {
        fun addLogsInfo(logSize: Long, logFilename: String?)
        fun setUpConceptsView()
        fun setConceptsInDbText(text: String?)
        fun addBuildVersionInfo()
        fun addPrivacyPolicyInfo()
        fun rateUs()
        fun setDarkMode()
        fun chooseLanguage(languageList: Array<String>)
        fun setUpContactUsButton()
    }

    interface Presenter : BasePresenterContract {
        fun logException(exception: String?)
        fun updateConceptsInDBTextView()
        fun setDarkMode(darkMode: Boolean)
        val isDarkModeActivated: Boolean
        var language: String?
        val languagePosition: Int
    }
}