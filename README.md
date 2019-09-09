# __react-native-obscure__

# NOTICE

This fork updates RN to 0.60.5, build tools 28.

---

A react native android module for obscuring applications when switching applications and preventing taking screenshots of the application.

## Getting started

#### NPM

```
$ npm install @talaikis/react-native-obscure --save
```

#### Yarn

```
$ yarn add react-native-obscure
```

## Installation

### Mostly automatic installation

Nothing to do.

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
