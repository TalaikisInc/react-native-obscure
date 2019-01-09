# __react-native-obscure__

# NOTICE
This repository will not longer be mantained, because I don't use React Native anymore. Feel free to fork and mantain it. 

---

A react native android module for obscuring applications when switching applications and preventing taking screenshots of the application.

## Getting started

#### NPM

```
$ npm install react-native-obscure --save
```

#### Yarn

```
$ yarn add react-native-obscure
```

## Installation

### Mostly automatic installation

```
$ react-native link react-native-obscure
```

### Manual installation

#### Android

1. Open up `android/app/src/main/java/[...]/MainApplication.java`
  - Add `import com.diegofhg.obscure.ObscurePackage;` to the imports at the top of the file
  - Add `new ObscurePackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-obscure'
  	project(':react-native-obscure').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-obscure/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-obscure')
  	```

## Usage

You can use it programmatically for activating/deactivating the obscuring at any time, use it app-wide or per component.

`activateObscure`: Activates the obscuring.

`deactivateObscure`: Deactivate the obscuring.

```jsx
import React, { Component } from 'react';
import { View, Text } from 'react-native';

import Obscure from 'react-native-obscure';

export default class App extends Component {
  componentWillMount() {
    Obscure.activateObscure();
  }

  componentWillUnmount() {
    Obscure.deactivateObscure();
  }

  render() {
    return(
      <View>
        <Text>This text will be obscured when changing apps</Text>
      </View>
    );
  }
}
```

## TODOs

- Add iOS support.
